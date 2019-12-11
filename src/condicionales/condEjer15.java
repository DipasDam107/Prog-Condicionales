/*
 * Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos
muestre por pantalla la nota final en texto, con la siguiente equivalencia: Muy deficiente (0,1,2),
Insuficiente (3,4), Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10).
 */

package condicionales;
import java.util.*;

public class condEjer15 {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int nota;
        
        System.out.println("Introduce la nota: ");
        nota=teclado.nextInt();
        
        if(nota>=0 && nota<=10)
        {       
                switch(nota){

                case 0:
                case 1:
                case 2:
                    System.out.println("Muy Deficiente");
                break;

                case 3:
                case 4:
                    System.out.println("Deficiente");
                break;

                case 5:
                case 6:
                    System.out.println("Aprobado");
                break;

                case 7:
                case 8:
                    System.out.println("Notable");
                break;

                case 9:
                case 10:
                    System.out.println("Sobresaliente");
                break;
            }   
        } else System.out.println("Nota mal introducida");
    }
}
