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
class choose {
    static public int choosehoc , choosebor ;
    selecth sh = new selecth();
    selectc sc = new selectc();
    public void houseorcon(){
            System.out.println("\n-------- House and Condominium ---------");
            Scanner ip1 = new Scanner(System.in);
            System.out.println("Press 1:For House");
            System.out.println("Press 2:For Condominium");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            choosehoc = ip1.nextInt();
    
    while(!(choosehoc == 1 || choosehoc == 2 || choosehoc == 0)){
            System.out.println("\n- Please Press Number! -");
            System.out.println("Press 1:For House");
            System.out.println("Press 2:For Condominium");
            System.out.println("Press 0:For Back");
            System.out.print("Press Number: ");
            choosehoc = ip1.nextInt();
    }
    if(choosehoc == 1 ){
       sh.selecth();
    }else if(choosehoc == 2){
        sc.selectc();
    }else{ enter e = new enter(); 
    }
    }
}