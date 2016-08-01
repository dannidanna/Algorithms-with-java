
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class Ejercicio2SP {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
       List<String> chocolates;//se usa una lista pq no se sabe N la longitud del examen
        chocolates = new ArrayList<>();
        
        for(int i=0; i<casos; i++){
            String aux = scan.next();
            chocolates.add(i,aux);
        }
        
        for(int i=0; i<=casos; i++){
            String aux2 =chocolates.get(i);
            int cont=0;
           
                if(aux2.contains("S") && aux2.contains("C")){
                    subSecLarga(aux2);
                }
                else{
                if(aux2.contains("S")){
                    cont++;
                }
                if(cont==aux2.length()){
                System.out.println(aux2.length());
                }
                if(aux2.contains("C")){
                    cont++;
                }
                if(cont==aux2.length()){
                
                System.out.println(aux2.length());
                }}
           
        }
        
    }
    
    static int subSecLarga(String palabra){
        int res=0;
        
        return res;
    }
}
