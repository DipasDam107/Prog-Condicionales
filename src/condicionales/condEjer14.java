/*
Introduciendo dos fechas (día,mes,año), hacer un algoritmo que nos diga cual de las dos es
mayor (agrupa las condiciones de dia, mes y año en una sola sentencia condicional). Suponemos que
se introducen fechas válidas y no empleamos las clases de fecha de Java.
*/
package condicionales;

import java.util.*;

public class condEjer14 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int dia,mes,anio, dia2,mes2,anio2;
      System.out.println("Introduce dia: ");
      dia=teclado.nextInt();
     
      System.out.println("Introduce mes: ");
      mes=teclado.nextInt();
     
      System.out.println("Introduce año: ");
      anio=teclado.nextInt();
      
      System.out.println("Introduce dia 2: ");
      dia2=teclado.nextInt();
     
      System.out.println("Introduce mes 2: ");
      mes2=teclado.nextInt();
     
      System.out.println("Introduce año 2: ");
      anio2=teclado.nextInt();
      
      // La primera condicional va por amor al arte XD. Compruebo que alguno de los datos difiere en las dos fechas. 
      
      if (anio!=anio2 || mes!=mes2 || dia!=dia2){
         //Compruebo si la primera es mayor que la segunda
            if(anio>anio2 || anio==anio2 && mes>mes2 || anio==anio2 && mes==mes2 && dia>dia2) 
                 System.out.println("La fecha mayor es " + dia + "-" + mes + "-" + anio);
            //En caso contrario la segunda es mayor. Recordemos que sabemos que son distintas por la primera condicional
            else System.out.println("La fecha mayor es " + dia2 + "-" + mes2 + "-" + anio2);
            
      }
      
      else System.out.println("Las fechas son identicas"); 
     }
}
