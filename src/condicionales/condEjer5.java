/*INFO
Ifs anidados. Podemos poner if dentro de otros o irlos enlazando para contemplar mas condiciones si no se cumple la primera.
*/

/*EJERCICIO
 * Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en clase y la
nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las siguientes
situaciones
    + Nota examen mayor o igual a 5
    + Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab.practico mayor que
    cinco
    + Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la
      valoración del trabajo en clase.
Diseñar un algoritmo que lea la nota del examen, la valoración del trabajo en clase y la nota del
trabajo práctico y saque por pantalla si está aprobado o no, todo en con una sola sentencia
condicional
 */
package condicionales;

import java.util.*;

public class condEjer5 {
     public static void main(String [] args){
     float nota, trabajo, traClase;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Introduce la Nota del Examen: ");
     nota=teclado.nextFloat();
    
     System.out.println("Introduce Valoracion de Trabajo en clase: ");
     traClase=teclado.nextFloat();
     
     System.out.println("Introduce Nota de Trabajo Practico: ");
     trabajo=teclado.nextFloat();
     
     // Si la nota es mayor a 5 aprobao al canto
     if(nota>=5){System.out.println("Esta usted aprobado por su nota en el examen: " + nota);}
     // Si la nota es superior o igual a 4, y las otras dos partes estan aprobadas, aprobado
     else if(nota>=4 && traClase>=5 && trabajo>=5){System.out.println("Aprobado: Suspendio el examen con 4 o mas y aprobo las demas partes");}
     // Si ha suspendido con 4 o mas y ha sacado un 8 en una de las partes.... aprobado
     else if(nota>=4 && (trabajo>=8 || traClase>=8)){System.out.println("Aprobado: Suspendio el examen con 4 o mas y saco un 8 en una de las otras partes");}
     // Suspenso si nada se cumple
     else{System.out.println("Suspenso: Bienvenido a Septiembre");}
     
     
     }
}
