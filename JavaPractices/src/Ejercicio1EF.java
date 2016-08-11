
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danni
 */
public class Ejercicio1EF {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double areas[]=null;
        
        int numPruebas = scan.nextInt();
        String entradas[]= null;
        for(int i=0; i<numPruebas; i++){
            String entrada = scan.next();
            entradas[i] = entrada;
        }
        
        for(int i=0; i<entradas.length ; i++){
            String numeros[] =entradas[i].split(" ");
            int izq = Integer.parseInt(numeros[0]);
            int der = Integer.parseInt(numeros[1]);
            int h = Integer.parseInt(numeros[2]);
            
            double area = ((der-izq)*h)/2;
            areas[i]=area;
                }
        double res=0;
       for(int k=0; k<areas.length; k++){
           res = res - (areas[k]-areas[k+1]);
       }
       System.out.println(res);
    }
    
}
