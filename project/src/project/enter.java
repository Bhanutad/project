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
class enter {
    enter(){
        choose ch = new choose();
        Scanner ip = new Scanner(System.in);
        System.out.println("\nPress 1:For Login member");
        System.out.println("Press 2:For Ret or Buy House&Condo");
        System.out.print("Press Number: ");
        int number = ip.nextInt();
        
        while(!(number == 1 || number == 2 )){
                System.out.println("\n- Please Press Number! -");
                System.out.println("Press 1:For Login member");
                System.out.println("Press 2:For Ret or Buy House&Condo");
                System.out.print("Press Number: ");
                number = ip.nextInt();
            }
        if(number == 1){
            login l = new login();  l.login();
        }else {
            ch.houseorcon();
        }
    }
}
    
class login extends buy{
        static String  login1 , login2 ;
        buy b = new buy();
    public void login(){
        do{ 
            Scanner user = new Scanner(System.in);
            System.out.println("_____________________________________");
            System.out.print("\nUsername : ");
            login1 = user.nextLine();
    
            Scanner pass = new Scanner(System.in);
            System.out.print("Password : ");
            login2 = pass.nextLine();
    
        if( !(login1.equals(b.name))){
                    System.out.println ("   Your username does't exist ");
                    System.out.println ("------- Please try again -------");
        }else if((login1.equals(b.name)&&!login2.equals(b.phone))){
                        System.out.println ("    Your password is wrong     ");
                        System.out.println ("------- Please try again -------");
        }
        
        }while(!(login1.equals(b.name) && login2.equals(b.phone))); //get back to login
    
        if(login1.equals(b.name) && login2.equals(b.phone)){
            System.out.println("\nCustumer "+login1);
        }
            System.out.println ("------login successful------");
            System.out.println ("");    
    }
}