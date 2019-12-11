/*
Diseñar un algoritmo al que se le introduzcan DIA, MES, AÑO, que verifique que los valores
introducidos sean correctos, sin emplear las clases de fechas de Java
*/
package condicionales;

import java.util.*;

public class condEjer12 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     
     int dia,mes, anio;
     
     System.out.println("Introduce dia: ");
     dia=teclado.nextInt();
     
     System.out.println("Introduce mes: ");
     mes=teclado.nextInt();
     
     System.out.println("Introduce año: ");
     anio=teclado.nextInt();
     
     //Compruebo que los datos son correctos
     if(dia>=1 && dia<=31 && mes >=1 && mes<=12){
        
         // A partir de aqui compruebo los meses especiales. Años bisiestos tambien
         if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) System.out.println("La fecha " + dia + "-" + mes + "-" + anio + " es correcta");
         else if (dia<31 && (mes==4||mes==6||mes==9||mes==11)) System.out.println("La fecha " + dia + "-" + mes + "-" + anio + " es correcta");
         else if (dia<=28 && mes==2 || dia<=29 && (anio%100!=0 && anio%4==0 || anio%400==0)) System.out.println("La fecha " + dia + "-" + mes + "-" + anio + " es correcta");
         else System.out.println("La fecha " + dia + "-" + mes + "-" + anio + " no es correcta");
     }
     
     else System.out.println("La has pifiado en los datos. Dias 1-31, meses 1-12");
     }
}
