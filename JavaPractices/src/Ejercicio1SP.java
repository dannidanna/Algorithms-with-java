
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
public class Ejercicio1SP {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        int res=0;
        List<Integer> respuestas;//se usa una lista pq no se sabe cuantas sumas se encontrara
        respuestas = new ArrayList<>();
        for(int i =0; i<=casos; i++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int aux;
            int numeros[] = new int[n];
            for(int j=0; j<n; j++){
                aux = scan.nextInt();
                numeros[j] = aux;
                
            }
            for(int j=0; j<n; j++){
                if(numeros[j]>0){//al empezar con un numero vamos a verificar que sea positivo, asi no recorremos negativos pq no suman nada
                    while((j+k+1)<=(n-1)){
                    res = numeros[j]+numeros[j+k+1];
                    j = j+k+1;
                }
                    respuestas.add(res);
                }
            }
            int size = respuestas.size();
            int respuesta=0;
            for(int j=0; j<size; j++){
                if(respuestas.get(j)> respuestas.get(j+1)){
                    respuesta = respuestas.get(j);}
                else{
                    respuestas.get(j+1);
                }
            }
            System.out.println(respuesta);
    }
}
}
