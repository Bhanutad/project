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
class calculate {
   static double money , total , percent = 0 , permonth = 0 , peryear = 0 , change = 0 ;
   static int choosehoc , choosebor , choosep;
   static String name ;
   choose ch = new choose();
   payby pb = new payby();
   type t = new type();
   Scanner ip9 = new Scanner(System.in);
   public void reciept(){
        System.out.println("\n==================================");
        System.out.println("      Welcome to Buy and Rent     ");
        System.out.println("       House and Condominium      ");
        System.out.println("==================================");
        System.out.println("Name            :"+pb.name);
        System.out.println("1:House|2:Condo : "+ch.choosehoc);
        System.out.println("Total : "+t.price+" Baht");
        System.out.println("Total Down payment: "+pb.down+" Baht");
        System.out.println("Cash  : "+money+" Baht");
        System.out.println("Change: "+change+" Baht");
        System.out.println("Total is: "+pb.totalprice+" Baht");
        System.out.println("Installment for month: "+permonth+" Baht");
        System.out.println("==================================");
        System.out.println("  WWW.BuyAndRentHouseAndCondo.com ");
        System.out.println("      Call Center: 02-9255231     ");
        System.out.println("==================================");
        System.out.println("============ THANK YOU ===========");
        System.out.println("==================================");
        
        enter e = new enter();
   }
}

class calpaycash extends calculate {
    public void calpaycash(){
        System.out.print("Enter your money: ");
        money = ip9.nextDouble();
        change = money - pb.total ;
        if(money < pb.total){
            System.out.println("\n** Money not enough **");
            System.out.println("Please put money again");
            calpaycash();
        }else{
            System.out.println("Change: "+change+" Baht");
            this.reciept();
        }
    }
}
class calpayin extends calculate{
    public void a(){
            peryear = pb.totalprice / 3 ;
            permonth = peryear / 12 ;
            System.out.println("\nYou pay with condition: A");
            System.out.println("Total Down payment: "+pb.down);
            System.out.print("Enter your money: ");
            money = ip9.nextDouble();
            change = money - pb.down ;
            if(money < pb.down){
                System.out.println("\n** Money not enough **");
                System.out.println("Please put money again");
                a();
            }else{
                System.out.println("Change: "+change+" Baht");
                System.out.println("Total is: "+pb.totalprice+" Baht");
                System.out.println("Installment for month: "+permonth+" Baht");
                this.reciept();
        }
    }
    public void b(){
            percent = pb.totalprice * 1.2 ;
            peryear = percent / 6 ;
            permonth = peryear / 12 ;
            System.out.println("\nYou pay with condition: B");
            System.out.println("Total Down payment: "+pb.down);
            System.out.print("Enter your money: ");
            money = ip9.nextDouble();
            change = money - pb.down ;
            if(money < pb.down){
                System.out.println("\n** Money not enough **");
                System.out.println("Please put money again");
                b();
            }else{
                System.out.println("Change: "+change+" Baht");
                System.out.println("Total is: "+pb.totalprice+" Baht");
                System.out.println("Installment for month: "+permonth+" Baht");
                this.reciept();
        }
    }
    public void c(){
            percent = pb.totalprice * 1.5 ;
            peryear = percent / 9 ;
            permonth = peryear / 12 ;
            System.out.println("\nYou pay with condition: C");
            System.out.println("Total Down payment: "+pb.down);
            System.out.print("Enter your money: ");
            money = ip9.nextDouble();
            change = money - pb.down ;
            if(money < pb.down){
                System.out.println("\n** Money not enough **");
                System.out.println("Please put money again");
                c();
            }else{
                System.out.println("Change: "+change+" Baht");
                System.out.println("Total is: "+pb.totalprice+" Baht");
                System.out.println("Installment for month: "+permonth+" Baht");
                this.reciept();
        }
    }
}