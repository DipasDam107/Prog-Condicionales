/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
/*Diseñar un programa capaz de leer dos valores enteros, m y n, y determine si m es divisor de
n y si m es mayor que n. Debe funcionar también si n es cero.*/
import java.util.*;

public class condEjer2 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int n, m;
     
     System.out.println("Introduzca número: ");
     n=teclado.nextInt();
     
     System.out.println("Introduzca número divisor: ");
     m=teclado.nextInt();
     
     //Comprobamos al empezar que el divisor no sea 0
     if(m!=0){
        
        //Comprobamos que el divisor no sea mayor que el numero y miramos si efectivamente es divisor o no
        if(m<=n && n!=0){
           if(n%m==0){System.out.println("El numero " +m+ " es divisor de " +n);}
           else{System.out.println("El numero " +m+ " no es divisor de " +n);}
        }
        
        //En caso de que el numero sea 0 o sea mayor que el divisor, avisamos
        else if(n==0){ System.out.println("El valor " +n + " no tiene divisor");}
             else{System.out.println("El numero " +m+ " es mayor que " +n+ ", por tanto no es divisor");}
     }
     
     else{System.out.println("El divisor no debe ser 0");}
     
     }
}
