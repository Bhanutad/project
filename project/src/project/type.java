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
public class type {
    static double price = 0 , priceone = 0 , pricetwo = 0 , pricesmall = 0 , pricebig = 0 ;
    static int n , numh , numc ;
    Scanner ip12 = new Scanner(System.in);
    public void onestair(){
        int[] onestair = new int[13];
        for(int h = 1 ; h <= onestair.length ; h++){
            System.out.println("["+ h +"]"+"\t:"); 
        }
        System.out.print("Choose your House: ");
        numh = ip12.nextInt();
        onestair[n+1] = numh ;
        if(onestair[n+1] == numh){
            System.out.println("-- This is ready for you --");
        }
        price = priceone + 4300000.0 ;
        choose ch = new choose();
        ch.buyorrent();
    } 
        public void twostair(){
        String[] twostair = new String[30];
        for(int h = 14 ; h <= twostair.length ; h++){
            System.out.println("["+ h +"]"+"\t:"); 
        }
        price = pricetwo + 5500000.0 ;
        choose ch = new choose();
        ch.buyorrent();
}
        
        
        public void smallroom(){
        String smallroom[] = new String[13];
        for(int c = 1 ; c <= smallroom.length ; c++){
            System.out.println("["+ c +"]"+"\t:"); 
        }
        price = pricesmall + 2000000.0 ;
        choose ch = new choose();
        ch.buyorrent();
    } 
        public void bigroom(){
        String bigroom[] = new String[30];
        for(int c = 14 ; c <= bigroom.length ; c++){
            System.out.println("["+ c +"]"+"\t:"); 
        }
        price = pricebig + 3000000.0 ;
        choose ch = new choose();
        ch.buyorrent();
}
}
