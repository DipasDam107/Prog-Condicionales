/*
 *Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo
    mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de
    segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de Java.
 */
package condicionales;

import java.util.*;

public class condEjer6 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int hora, minuto, segundo;
     
     System.out.println("Introduce la hora: ");
     hora=teclado.nextInt();
     // Compruebo dato por dato, que es correcto. En caso contrario, ya ni pido el siguiente. Podria hacerlo todo en una condicional al final, pero me dio por ahi
     
     if(hora<24 && hora>=0){
         System.out.println("Introduce el minuto: ");
         minuto=teclado.nextInt();
         
         if(minuto<60 && minuto>=0){
            System.out.println("Introduce el Segundo: ");
            segundo=teclado.nextInt();
             
             if(segundo<60 && segundo>=0){
                      //Si todo es correcto, hago el calculo
                      System.out.println("Han pasado " +(segundo + (60*minuto) + (60*60*hora)) + " segundos desde que empezó este maravilloso dia");
                 
             } else{System.out.println("Te has equivocado en los segundos");}
             
         } else{System.out.println("Te has equivocado en los minutos");}
         
     } else{System.out.println("Te has equivocado en las horas");}
     
   
     
     }
}
