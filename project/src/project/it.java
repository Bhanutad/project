/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class it {
    static String name , phone ;
    static double money , total , percent = 0 , permonth = 0 , peryear = 0 , change = 0 ;
    static int choosehoc , choosebor , choosep;
    calculate c = new calculate();
    choose ch = new choose();
    payby pb = new payby();
    type t = new type();
    it(String name , String phone){
        this.name = name ;
        this.phone = phone ;  
    }
    public void information(){
        System.out.println("Name            :"+pb.name);
        System.out.println("1:House|2:Condo : "+ch.choosehoc);
        System.out.println("Total : "+t.price+" Baht");
        System.out.println("Total Down payment: "+pb.down+" Baht\n");
        System.out.println("Total is: "+pb.totalprice+" Baht");
        System.out.println("Amount to pay for month: "+c.permonth+" Baht");
        balance bl = new balance(); bl.etc();
    }
}
class balance {
    private int money ;
    public double change , total = 0 ;
    static int press ;
    calculate c = new calculate();
    payby pb = new payby();
   public void etc(){
       Scanner ip13 = new Scanner(System.in);
       System.out.println("_______________________________________");
       System.out.println("Press 1:For Payment");
       System.out.println("Press 2:For Logout");
       System.out.print("Press Number: ");
       press = ip13.nextInt();
       
       switch(press){
           case 1: payment(); break;
           case 2: enter e = new enter(); break ;
           default: etc(); break;
       }
   }
   public void payment(){
        Scanner ip14 = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("Payments: "+c.permonth);
        System.out.print("Enter your money: ");
        money = ip14.nextInt();
        change = money - c.permonth;
        if(money < c.permonth){
            System.out.println("\n** Money not enough **");
            System.out.println("Please put money again");
            payment();
        }else{
            total = pb.totalprice - c.permonth ;
            System.out.println("Change: "+change+" Baht");
            System.out.println("Total: "+total);
            System.out.println("----------------------------------");
            enter e = new enter();
        }
    }
   }