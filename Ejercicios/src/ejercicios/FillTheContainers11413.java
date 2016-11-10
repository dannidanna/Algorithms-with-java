/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
 *
 * @author danni
 */
public class FillTheContainers11413 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int aux;
        List<Integer> numeros;
        numeros = new ArrayList<>();
        List<Integer> capacidades;
        capacidades = new ArrayList<>();
        int capacidad=0;
        int cont =0;
        
       for(int j=0; j<n; j++){
            aux = scan.nextInt();
            numeros.add(aux);
       }
       int aux2 = n-m+1; 
       int aux3=m;
       while(aux2>0){
        for(int i=cont; aux3>0; i++){
             capacidad = capacidad + numeros.get(i);
             aux3--;
             }
            aux3 = m;
            capacidades.add(capacidad);
            cont++;
            capacidad =0;
            aux2--;
        }
         
        System.out.println(minimo(capacidades));
    }
   
    public static int minimo(List<Integer> capacidades){
        int menor = capacidades.get(0);
        for(int i=0; i<capacidades.size(); i++){
            if(capacidades.get(i)< menor)
                menor = capacidades.get(i);
        
    }
        return menor;
    }
}

