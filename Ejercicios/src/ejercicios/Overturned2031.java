/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;


/**
 *
 * @author danni
 */
public class Overturned2031{
    public static void main(String args[]){
        
        int n = 4;
        
        if(n<5){
           if(n==1)
               System.out.println("01");
           if(n==2)
               System.out.println("11 01");
           if(n==3)
               System.out.println("11 01 60");
           if(n==4)
               System.out.println("11 01 60 08");
        }
        else
            System.out.println("Glupenky Pierre");
    }
    
}
