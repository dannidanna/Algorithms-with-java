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
public class RelationalOperator11172 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int num1, num2;
        
        for(int j=0; j<i; j++){
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if(num1 > num2)
                System.out.println(">");
            else
                if(num2>num1)
                   System.out.println("<"); 
                else
                    System.out.println("=");
            
        }
    }
    
}
