/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author danni
 */
public class BurbujaOrd {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros;
        numeros = new ArrayList<>();
        int aux=1, aux2=0;
        while(aux>0){
            aux=scan.nextInt();
            numeros.add(aux);
        }
        int dim = numeros.size();
        
       for(int j=0; j<dim-1; j++){
        for(int i=0; i<dim-j-1; i++){
            if(numeros.get(i+1)<numeros.get(i)){
                aux2=numeros.get(i+1);
                numeros.remove(i+1);
                numeros.add(i+1, numeros.get(i));
                numeros.remove(i);
                numeros.add(i, aux2);
            }
        }
       
    }
       System.out.println(numeros);
    }
    
}
