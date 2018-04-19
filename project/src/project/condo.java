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
abstract class condo {
    public int choosec ;
    public abstract void detailbuy();
    public abstract void detailrent();
    public void condo(){
            type t = new type();
            selectc sc = new selectc();
            choose ch = new choose();
            System.out.println("\n----------- Condominium -----------");
            Scanner ip10 = new Scanner(System.in);
            System.out.println("Press 1:For Purchasing Information");
            System.out.println("Press 2:For Rental Information");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            choosec = ip10.nextInt();
    
    while(!(choosec == 1 || choosec == 2 || choosec == 0)){
            System.out.println("\n- Please Press Number! -");
            System.out.println("Press 1:For Purchasing Information");
            System.out.println("Press 2:For Rental Information");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            choosec = ip10.nextInt();
    }
    if(choosec == 1 ){
        sc.detailbuy();
    }else if(choosec == 2){
        sc.detailrent(); 
    }else { ch.houseorcon(); }
    }
    
    public void selectcondo(){
        type t = new type();
            selectc sc = new selectc();
            System.out.println("\n----------- Condominium -----------");
            Scanner ip10 = new Scanner(System.in);
            System.out.println("Press 1:For Small room");
            System.out.println("Press 2:For Big   room");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            choosec = ip10.nextInt();
    
    while(!(choosec == 1 || choosec == 2 || choosec == 0)){
            System.out.println("\n- Please Press Number! -");
            System.out.println("Press 1:For Small room");
            System.out.println("Press 2:For Big   room");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            choosec = ip10.nextInt();
    }
    if(choosec == 1 ){
        t.smallroom();
    }else if(choosec == 2){
        t.bigroom();
    }else{ condo(); }
    }
    }

class selectc extends condo {
    public void selectc(){
      super.condo();
    }
    public void detailbuy(){
        System.out.println("_______________________________");
        System.out.println("\n******* For Small Room *******");        
        System.out.println("- Have a Big Bedrooms");        
        System.out.println("- Have a Kitchen");        
        System.out.println("- Have a Toilet and a Bathroom");        
        System.out.println("- Have a Little Garden");
        System.out.println("- Free some Forniture");
        System.out.println("Free public Carpark & Swimming pool");
        System.out.println("--------- 2 Million ฿ ----------");
        System.out.println("________________________________");
        System.out.println("\n******** For Big Room ********");        
        System.out.println("- Have two Big Bedrooms");        
        System.out.println("- Have a Kitchen");        
        System.out.println("- Have two Toilets and a Bathrooms");        
        System.out.println("- Have a Little Garden");
        System.out.println("- Free some Forniture");
        System.out.println("Free public Carpark & Swimming pool");
        System.out.println("---------- 3 Million ฿ ---------"); 
        System.out.println("________________________________");
        
       super.selectcondo();
    }
    public void detailrent(){
        System.out.println("_______________________________");
        System.out.println("\n******* For Small Room *******");        
        System.out.println("- Have a Big Bedrooms");        
        System.out.println("- Have a Kitchen");        
        System.out.println("- Have a Toilet and a Bathroom");        
        System.out.println("- Have a Little Garden");
        System.out.println("- Free some Forniture");
        System.out.println("Free public Carpark & Swimming pool");
        System.out.println("------ 4,900 Baht/Month --------");
        System.out.println("________________________________");
        System.out.println("\n******** For Big Room ********");        
        System.out.println("- Have two Big Bedrooms");        
        System.out.println("- Have a Kitchen");        
        System.out.println("- Have two Toilets and a Bathrooms");        
        System.out.println("- Have a Little Garden");
        System.out.println("- Free some Forniture");
        System.out.println("Free public Carpark & Swimming pool");
        System.out.println("------- 5,900 Baht/Month -------"); 
        System.out.println("________________________________");
        
       super.selectcondo();
    }
}