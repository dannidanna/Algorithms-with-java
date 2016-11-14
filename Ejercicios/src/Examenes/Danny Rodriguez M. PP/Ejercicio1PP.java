/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes;

import java.util.Scanner;

/**
 *
 * @author danni
 */
public class Ejercicio1PP {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();
        int numeros[] = new int[n];
        
        int resp=0;
        int aux1=1;
        
        for(int j=0; j<n; j++){
            int num = scan.nextInt();
            numeros[j]=num;
        }
        
       
       for(int j=0; j<k-1; j++){
       int num = numeros[j];
       int cont=0;
       int aux=1;
       
       for(int h=j; h<k; h++){
       for(int i=h; k>=aux; i++){
           if(num>numeros[i+1])
               cont++;
       aux++;
       }
       if(cont==k){
           resp++;
       }}}
       
       
        
       
       
    System.out.println(resp);    
    }
        
 }
    
