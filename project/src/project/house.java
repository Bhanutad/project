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
abstract class house {
    public int chooseh ;
    public abstract void detailbuy();
    public abstract void detailrent();
    public void house(){
            type t = new type();
            selecth sh = new selecth();
            choose ch = new choose();
            System.out.println("\n------------- House -------------");
            Scanner ip3 = new Scanner(System.in);
            System.out.println("Press 1:For Purchasing Information");
            System.out.println("Press 2:For Rental Information");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            chooseh = ip3.nextInt();
    
    while(!(chooseh == 1 || chooseh == 2 || chooseh == 0)){
            System.out.println("\n- Please Press Number! -");
            System.out.println("Press 1:For Purchasing Information");
            System.out.println("Press 2:For Rental Information");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            chooseh = ip3.nextInt();
    }
    if(chooseh == 1 ){
        sh.detailbuy();
    }else if(chooseh == 2){
        sh.detailrent();
    }else{ ch.houseorcon(); }
    }
    public void selecthouse(){
            type t = new type();
            System.out.println("\n------------- House -------------");
            Scanner ip3 = new Scanner(System.in);
            System.out.println("Press 1:For Single 1Stair House");
            System.out.println("Press 2:For Single 2Stair House");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            chooseh = ip3.nextInt();
            while(!(chooseh == 1 || chooseh == 2 || chooseh == 0)){
            System.out.println("\n- Please Press Number! -");
            System.out.println("Press 1:For Single 1Stair House");
            System.out.println("Press 2:For Single 2Stair House");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            chooseh = ip3.nextInt();
    }
    if(chooseh == 1 ){
        t.onestair();
    }else if(chooseh == 2){
        t.twostair();
    }else{ house(); }
    }
    }

class selecth extends house {
    public void selecth(){
      super.house();
    }
    public void detailbuy(){
        System.out.println("_______________________________");
        System.out.println("\n*** For Single 1Stair House ***");        
        System.out.println("- Have a Big Bedrooms");        
        System.out.println("- Have a Kitchen");        
        System.out.println("- Have a Toilet and a Bathroom");        
        System.out.println("- Have a Garage");
        System.out.println("- Have a Little Garden");
        System.out.println("- Free some Forniture");
        System.out.println("--------- 4.3 Million ฿ --------");
        System.out.println("________________________________");
        
        System.out.println("\n*** For Single 2Stair House ***");        
        System.out.println("- Have two Big Bedrooms");        
        System.out.println("- Have a Kitchen");        
        System.out.println("- Have two Toilets and a Bathrooms");        
        System.out.println("- Have a Garage ");
        System.out.println("- Have a Little Garden");
        System.out.println("- Have a Swimming pool");
        System.out.println("- Free some Forniture");
        System.out.println("--------- 5.5 Million ฿ --------"); 
        System.out.println("________________________________");
        
       super.selecthouse();
    }
    public void detailrent(){
        System.out.println("_______________________________");
        System.out.println("\n*** For Single 1Stair House ***");        
        System.out.println("- Have a Big Bedrooms");        
        System.out.println("- Have a Kitchen");        
        System.out.println("- Have a Toilet and a Bathroom");        
        System.out.println("- Have a Garage");
        System.out.println("- Have a Little Garden");
        System.out.println("- Free some Forniture");
        System.out.println("------- 7,500 Baht/Month -------");
        System.out.println("________________________________");
        
        System.out.println("\n*** For Single 2Stair House ***");        
        System.out.println("- Have two Big Bedrooms");        
        System.out.println("- Have a Kitchen");        
        System.out.println("- Have two Toilets and a Bathrooms");        
        System.out.println("- Have a Garage ");
        System.out.println("- Have a Little Garden");
        System.out.println("- Have a Swimming pool");
        System.out.println("- Free some Forniture");
        System.out.println("------- 8,900 Baht/Month -------"); 
        System.out.println("________________________________");
        
       super.selecthouse();
    }
}