/*
 *  Estudia qué pretende hacer el siguiente programa en Java. ¿Funciona correctamente? ¿Falta
 *  alguna llave? Propon un programa que realice la misma tarea pero más corto y no tan confuso.
 */
package condicionales;

import java.util.Scanner;
public class condEjer7 {
    public static void main(String[] args) {
        int var1, var2, var3;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Introduce el valor de variable 1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce el valor de variable 2: ");
        var2 = teclado.nextInt();
        System.out.print("Introduce el valor de variable 3: ");
        var3 = teclado.nextInt();
        
            if (var1 > var2 && var1 > var3)
                if (var2 > var3) System.out.println(var1 + ">=" + var2 + ">=" + var3);
                else System.out.println(var1 + ">=" + var3 + ">=" + var2);
            
            else
                if (var2 > var3)
                    if (var1 > var3) System.out.println(var2 + ">=" + var1 + ">=" + var3);
                    else System.out.println(var2 + ">=" + var3 + ">=" + var1);
                else
                    if (var1 > var2) System.out.println(var3 + ">=" + var1 + ">=" + var2);
                    else System.out.println(var3 + ">=" + var2 + ">=" + var1);
                
}}
/*Ordena los numeros de mayor a menor
  Son incorrectos los ultimos if else, tienen el texto mal
  No necesitan llaves
  Se podria hacer mas facil con arrays
*/

