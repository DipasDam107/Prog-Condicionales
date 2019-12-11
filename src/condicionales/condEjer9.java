/*
 Diseñar un algoritmo que informe si un año introducido previamente es bisiesto o no. Son
bisiestos los años múltiplos de 4 que no sean múltiplos de 100. Como excepción los múltiplos de 400
también son bisiestos. Se puede hacer una primera versión con varias sentencias condicionales y
otra más sofisticada con una sola. No usar las clases de fechas de Java
 */
package condicionales;

import java.util.*;

public class condEjer9 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int anio;
     
     System.out.println("Introduce año: ");
     anio=teclado.nextInt();
     
     //Miramos si es divisible por 4 y no por 100, o es divisible por 400, para saber si es bisiesto
     if(anio%100!=0 && anio%4==0 || anio%400==0) System.out.println("El año " + anio + " es bisiesto");
     else System.out.println("El año " + anio + " no es bisiesto");
     
     }
}
