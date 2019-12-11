package condicionales;

import java.util.*;

public class condEjer11 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int hora;
     
     System.out.println("Introduce hora: ");
     hora=teclado.nextInt();
     
     //Si la hora es correcta...
     if(hora>=0 && hora<24){
         switch(hora){
             //No hago break porque el resultado de ambas condicionees es el mismo
             case 9:
             case 11:
                 System.out.println("A la hora " + hora + " tienes buses solo los domingos");
                 break;
             
             case 10:
                 System.out.println("A la hora " + hora + " tienes buses todos los dias");
                 break;
             
             case 12:
                 System.out.println("A la hora " + hora + " tienes buses jueves y domingos");
                 break;
             
             case 13:
                 System.out.println("A la hora " + hora + " tienes buses miercoles y domingos");
                 break;
             
             case 14:
                 System.out.println("A la hora " + hora + " tienes buses todos los dias menos los sabados");
                 break;
             
             default:
                 System.out.println("No tienes buses a esa hora");
                 break;    
             
         }
     }
     
     else System.out.println("La has pifiado en los datos");
     }
}
