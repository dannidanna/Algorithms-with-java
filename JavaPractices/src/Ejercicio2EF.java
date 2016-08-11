
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danni
 */
public class Ejercicio2EF {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> entradas = new ArrayList();
        
        //ArrayList<String> respuestas = new ArrayList();
        //String respuesta[]=null;
        String entrada = scan.next();
        entradas.add(entrada);
        int i=0;
        while( i < 10){//num aleatorio 10 entradas
            entrada = scan.next();
            entradas.add(entrada);
            i++;
        }
        
        int cont=0;
         int cont2=0;
        String clave1 = "(.|^)\\..\\@.?\\S(.|$)";
        String clave2 = "(.|^)\\@.?\\S(.|$)";
        String clave3 = "(.|^)\\@.?\\S(.|$)*";
        String clave4 = "(.|^)*\\@.?\\S(.|$)*";
        String clave5 = "(.|^)\\@\\S(|$)";
        String clave6 = "\\.\\.+"; //para dos puntos o mas
        
        for(int j=0; j<entradas.size();j++){
        Pattern pat = Pattern.compile(clave1);
        Matcher mat = pat.matcher(entradas.get(j));
        Pattern pat2 = Pattern.compile(clave2);
        Matcher mat2 = pat2.matcher(entradas.get(j));
        Pattern pat3 = Pattern.compile(clave3);
        Matcher mat3 = pat3.matcher(entradas.get(j));
        Pattern pat4 = Pattern.compile(clave4);
        Matcher mat4 = pat4.matcher(entradas.get(j));
        Pattern pat5= Pattern.compile(clave5);
        Matcher mat5 = pat5.matcher(entradas.get(j));
        Pattern pat6= Pattern.compile(clave6);
        Matcher mat6 = pat6.matcher(entradas.get(j));
        if(entradas.get(j).contains("@.")||mat6.matches()||entradas.get(j).contains(" ")){
            cont=cont+ 0;}
            else{
            if (mat.matches()){//||mat2.matches()) {
                cont++;}
            if(mat2.matches()){
                    cont++;
                }
            if (mat3.matches()){//||mat2.matches()) {
                cont++;}
            if (mat4.matches()){//||mat2.matches()) {
                cont++;}
            if (mat5.matches()){//||mat2.matches()) {
                cont++;}
        }}
        
        System.out.println("Correos validos "+ cont);
    }
    
}
