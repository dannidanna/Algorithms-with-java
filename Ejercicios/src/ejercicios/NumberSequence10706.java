/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author danni
 */
public class NumberSequence10706 {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();//test cases
        int is[] = new int[t];
        Boolean esCorrecto = false;
        BigInteger sequence= new BigInteger("112123123412345123456123456712345678123456789");
        String numero = sequence.toString();
        for(int j=0; j<t; j++){
            int i = scan.nextInt();
            is[j]=i;
        }
        
        char resp=0;
        for(int h=0; h<t; h++){
            int u= is[h];
            for(int j=0; j<u; j++){
                resp = numero.charAt(j);
            }
            System.out.println(resp);
        
    }}
        
    }

