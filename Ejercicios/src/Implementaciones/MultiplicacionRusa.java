/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

/**
 *
 * @author danni
 */
public class MultiplicacionRusa {
    public static void main(String args[]){
        int multiplicando =78;
        int multiplicador=95;
        System.out.println(multiplicacion(multiplicando, multiplicador));
    }
    
    public static int multiplicacion(int multiplicando, int multiplicador){
        int sumandos=0, esImpar=0;//para ir sumando
        while(multiplicando>=1){
            esImpar=multiplicando;
            if(impar(esImpar)){
            sumandos=sumandos +multiplicador;
            }
            multiplicando/=2;
            multiplicador*=2;
    }
        return sumandos;
    }
    
    public static Boolean impar(int numero){
        Boolean resp=false;
        if((numero%2)==0)
            resp= false;
        else
            resp=true;
        return resp;
    }
    
}
