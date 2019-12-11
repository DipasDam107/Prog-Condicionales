/*
 *Diseñar un programa capaz de leer un número entero y de determinar si se trata de un número par o impar
 */
package condicionales;

import java.util.*;

public class condEjer1 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int numero;
     System.out.println("Introduzca número: ");
     numero=teclado.nextInt();
     
     //El numero es par si al dividirlo por 2 da 0
     if(numero%2==0){
            System.out.println("El numero " + numero + " es par");
         }
     else{
            System.out.println("El numero " + numero + " es impar");
     
     }
     }
}
