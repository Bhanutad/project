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
class rent {
    String name , phone ;
    double total ;
    buy b = new buy();
    type t = new type();
    private String choosef ;
    public void confirm(){
        Scanner ip4 = new Scanner(System.in);
        System.out.println("\n- Are you Conferm to rent the House//Condominium -");
        System.out.println("Press Y : For Conferm");
        System.out.println("Press N : For Back");
        System.out.print("Y / N   : ");
        choosef = ip4.nextLine();
    if(choosef.equalsIgnoreCase("Y")){
        fillin f = new fillin();
    }else if(choosef.equalsIgnoreCase("N")){
        choose ch = new choose();
        ch.buyorrent();
    }else{ confirm();}
}
}
class fillin extends rent{
    fillin(){
        Scanner ip11 = new Scanner(System.in);
        System.out.println("______________________________\n");
        System.out.print("Enter Your Name: ");
        name = ip11.nextLine();
        b.arrname.add(name);
        System.out.print("Phone number: ");
        phone = ip11.nextLine();
        b.arrphone.add(phone);
        System.out.println("- You Have to pay in the First month -");
        System.out.println("Total is: "+t.price+" Baht");
        total = t.price - t.price ;
    }
} 
class payrent extends fillin{
    payrent(){
        
    }
}