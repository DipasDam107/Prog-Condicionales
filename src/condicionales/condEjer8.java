/*
 *Un sistema de ecuaciones lineales de la forma:
ax + by = c
dx + ey = f
puede resolverse utilizando las siguientes fórmulas:
 */

package condicionales;

import java.util.*;

public class condEjer8 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     float a,b,c,d,e,f,x,y;
     
       System.out.print("Introduce el valor de variable a: ");
       a = teclado.nextInt();
       System.out.print("Introduce el valor de variable b: ");
       b = teclado.nextInt();
       System.out.print("Introduce el valor de variable c: ");
       c = teclado.nextInt();
       System.out.print("Introduce el valor de variable d: ");
       d = teclado.nextInt();
       System.out.print("Introduce el valor de variable e: ");
       e = teclado.nextInt();
       System.out.print("Introduce el valor de variable f: ");
       f = teclado.nextInt();
       
       //Hay que comprobar que la división por 0 no se realiza para que el programa funcione correctamente.
       
       if(((a*e)-(b*d)) != 0){
            x=(((c*e)-(b*f))/((a*e)-(b*d)));
            y=(((a*f)-(c*d))/((a*e)-(b*d)));
            System.out.print("X: " +x);
            System.out.print("Y: " +y);
       }
       
       //En caso de que sea 0, no hago el calculo
       else{
           System.out.print("Hay una division por 0. Sa liao");
       }
        
     }
}
