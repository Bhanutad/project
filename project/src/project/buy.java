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
import java.util.ArrayList;
import java.util.Scanner;
interface cash{
    public void paycash();
}
interface installment{
    public void payinstallment();
}
class buy{
    ArrayList arrname = new ArrayList();
    ArrayList arrphone = new ArrayList();
    public String choosef ;
    static double total = 0 , down = 0 , totalprice = 0 ; 
    static String name , phone ;
    type t = new type();  
    public void confirm(){
        Scanner ip4 = new Scanner(System.in);
        System.out.println("\n- Do you Confirm to buy the House//Condominium -");
        System.out.println("Press Y : For Confirm");
        System.out.println("Press N : For Cancel");
        System.out.print("Y / N   : ");
        choosef = ip4.nextLine();
    
    if(choosef.equalsIgnoreCase("Y")){
        payby pb = new payby();
        pb.payby();
    }else if(choosef.equalsIgnoreCase("N")){
        choose ch = new choose();
        ch.houseorcon();
    }else{ confirm();}
}
}


class payby extends buy implements cash , installment{
    static private int choosep ;
    public void payby(){
        Scanner ip5 = new Scanner(System.in);
        System.out.println("\n- Do you want to pay by Cash//installment -");
        System.out.println("Press 1:Pay by Cash");
        System.out.println("Press 2:Pay by installment");
        System.out.println("Press 0:For Back");
        System.out.print("Press number: ");
        choosep = ip5.nextInt();
        
        switch(choosep){
            case 1: paycash(); break;
            case 2: payinstallment(); break;
            case 0: confirm(); break;
            default: payby(); break;
        }
    }
    
    public void paycash(){
        Scanner ip6 = new Scanner(System.in);
        System.out.println("______________________________\n");
        System.out.print("Enter Your Name: ");
        name = ip6.nextLine();
        arrname.add(name);
        System.out.print("Phone number: ");
        phone = ip6.nextLine();
        arrphone.add(phone);
        System.out.println("- You pay by cash -");
        System.out.println("Total is: "+t.price+" Baht");
        total = t.price ;   
        calpaycash cpc = new calpaycash();
        cpc.calpaycash();
    }
    
    public void payinstallment(){ 
        Scanner ip7 = new Scanner(System.in);
        System.out.println("______________________________\n");
        System.out.print("Enter Your Name: ");
        name = ip7.nextLine();
        arrname.add(name);
        System.out.print("Phone number: ");
        phone = ip7.nextLine();
        arrphone.add(phone);
        System.out.println("- You pay by installment -");
        System.out.println("Total is: "+t.price+" Baht");
        total = t.price ;
        System.out.print("Enter your Down payment: ");
        down = ip7.nextDouble();
        totalprice = t.price - down ;
        slpayinstallment payin = new slpayinstallment();
    }
    
    public void sure(){
        Scanner ip4 = new Scanner(System.in);
        System.out.println("\n- Are you Conferm to rent the House//Condominium -");
        System.out.println("Press Y : For Confirm");
        System.out.println("Press N : For Cancel");
        System.out.print("Y / N   : ");
        choosef = ip4.nextLine();
       if(choosef.equalsIgnoreCase("Y")){
           fillin();
      }else if(choosef.equalsIgnoreCase("N")){
          choose ch = new choose();
          ch.houseorcon();
      }else{ sure();}
}
    
    public void fillin(){
        Scanner ip11 = new Scanner(System.in);
        System.out.println("______________________________\n");
        System.out.print("Enter Your Name: ");
        name = ip11.nextLine();
        arrname.add(name);
        System.out.print("Phone number: ");
        phone = ip11.nextLine();
        arrphone.add(phone);
        System.out.println("- You Have to pay in the First month -");
        System.out.println("Total is: "+t.price+" Baht");
        total = t.price ;   
        calpaycash cpc = new calpaycash();
        cpc.calpaycash();
    }
}


class slpayinstallment{
    calpayin cpi = new calpayin();
    private String press ;
    slpayinstallment(){
        do{
        Scanner ip8 = new Scanner(System.in);
        System.out.println("\n------- Pay by Installment -------");
        System.out.println("Press A:Interest 0% for 3 year");
        System.out.println("Press B:Interest 1.2% for 6 year");
        System.out.println("Press C:Interest 1.5% for 9 year");
        System.out.println("Press N:For Back");
        System.out.print("Plase Press: ");
        press = ip8.nextLine();
        
        }while(!(press.equalsIgnoreCase("A") || press.equalsIgnoreCase("B") || 
             press.equalsIgnoreCase("C") || press.equalsIgnoreCase("N") )); 
       
        if(press.equalsIgnoreCase("A")){
            cpi.a();
        }else if(press.equalsIgnoreCase("B")){
            cpi.b();
        }else if(press.equalsIgnoreCase("C")){
            cpi.c();
        }else{ payby pb = new payby();      pb.payby(); }          
        }
    }
