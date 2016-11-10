/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author danni
 */
public class InternalRateOfReturn11881 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,int[]> lista = new HashMap<>();
        int t = scan.nextInt();
        int valores[] = new int[t+1];
        for(int j=0; j<t; j++){
            int i = scan.nextInt();
            valores[j]=i;
        }
        lista.put(t, valores);
        System.out.println(lista);
    }
    
}
