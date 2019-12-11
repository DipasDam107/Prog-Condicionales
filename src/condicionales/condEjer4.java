/*
Diseñar un programa que lea tres números enteros. Si todos son negativos, mostrar el
producto de los tres. Si alguno es negativo pero no todos, mostrar la suma de los tres. En caso de
que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el tercero. ¿existe
alguna combinación de los valores leídos no contemplado en el algoritmo? (Suponer que el cero es
un número positivo). Hacer el programa lo más sencillo posible
 */
package condicionales;

import java.util.*;

public class condEjer4 {
     public static void main(String [] args){
     int n, m, a;
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Introduzca número n: ");
     n=teclado.nextInt();
     
     System.out.println("Introduzca número m: ");
     m=teclado.nextInt();
     
     System.out.println("Introduzca número m: ");
     a=teclado.nextInt();
     
     // Comprobamos si todos son menores que 0 (negativos)
     if(a<0 && m<0 && n<0){System.out.println("Son todos negativos. El producto es: " + (a*m*n));}
     // Comprobamos si hay algun negativo
     else if(a<0 || m<0 || n<0){System.out.println("Hay algun negativo suelto. La suma es: " + (a+m+n));}
     // En caso contrario, todos positivos. Todo OK Jose Luis....
     else{System.out.println(" Resultado: " + ((m+n)*a));}
     }
}

/*Como los ceros son tenidos en cuenta como positivos, todos los casos estan contemplados*/