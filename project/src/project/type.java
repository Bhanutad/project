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
public class type {
    static double price = 0 , priceone = 0 , pricetwo = 0 , pricesmall = 0 , pricebig = 0 ;
    static int h , x , numc ;
    static String[] numh ;
    Scanner ip12 = new Scanner(System.in);
    public void onestairbuy(){
        ArrayList onestair = new ArrayList(13);
        for( h = 1 ; h <= 13; h++){
            System.out.println("["+ h +"]"+"\t: "+numh); 
        }
        System.out.print("Choose your House: ");
        x = ip12.nextInt();
        numh[x] = "Served" ;
        onestair.add(numh);
        
        price = priceone + 4300000.0 ;
        buy b = new buy();
        b.confirm();
    } 
    public void twostairbuy(){
        String[] twostair = new String[30];
        for(int h = 14 ; h <= twostair.length ; h++){
            System.out.println("["+ h +"]"+"\t:"); 
        }
        price = pricetwo + 5500000.0 ;
        buy b = new buy();
        b.confirm();
    }     
    public void onestairrent(){
        int[] onestair = new int[13];
        for(int h = 1 ; h <= onestair.length ; h++){
            System.out.println("["+ h +"]"+"\t:"); 
        }
        price = priceone + 7800.0 ;
        payby pb = new payby();
        pb.sure();
    } 
    public void twostairrent(){
        String[] twostair = new String[30];
        for(int h = 14 ; h <= twostair.length ; h++){
            System.out.println("["+ h +"]"+"\t:"); 
        }
        price = pricetwo + 8900.0 ;
        payby pb = new payby();
        pb.sure();
}
        
        
    public void smallroombuy(){
        String smallroom[] = new String[13];
        for(int c = 1 ; c <= smallroom.length ; c++){
            System.out.println("["+ c +"]"+"\t:"); 
        }
        price = pricesmall + 2000000.0 ;
        buy b = new buy();
        b.confirm();
    } 
    public void bigroombuy(){
        String bigroom[] = new String[30];
        for(int c = 14 ; c <= bigroom.length ; c++){
            System.out.println("["+ c +"]"+"\t:"); 
        }
        price = pricebig + 3000000.0 ;
        buy b = new buy();
        b.confirm();
}
    public void smallroomrent(){
        String smallroom[] = new String[13];
        for(int c = 1 ; c <= smallroom.length ; c++){
            System.out.println("["+ c +"]"+"\t:"); 
        }
        price = pricesmall + 5900.0 ;
        payby pb = new payby();
        pb.sure();
    } 
    public void bigroomrent(){
        String bigroom[] = new String[30];
        for(int c = 14 ; c <= bigroom.length ; c++){
            System.out.println("["+ c +"]"+"\t:"); 
        }
        price = pricebig + 6900.0 ;
        payby pb = new payby();
        pb.sure();
}
}
