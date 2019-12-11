/*
La tabla siguiente representa las horas de salida de un bus . Diseña un algoritmo al que se le
introduzca el día (1-7) y la hora (9-14), verifique la entrada y nos informe si hay bus o no. Hacer una
primera condición que haga la verificación de la entrada de datos y otra única condición para ver si
hay bus
 */
package condicionales;

import java.util.*;

public class condEjer10 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     
     int dia,hora;
     String cadena = "El ";
     
     System.out.println("Introduce dia: ");
     dia=teclado.nextInt();
     
     System.out.println("Introduce hora: ");
     hora=teclado.nextInt();
     
     //Si el dia y la hora son correctos
     if ((dia>=1 && dia <=7) && (hora>=9 && hora <=14 )){
         
        //Puse un switch para que me ponga el dia en letras... Una parida. Voy construyendo la cadena
          switch (dia){
              case 1:
                  cadena=cadena.concat("Lunes a las " + hora);
                  break; 
              
              case 2:
                  cadena=cadena.concat("Martes a las " + hora);
                  break;   
               
              case 3:
                  cadena=cadena.concat("Miercoles a las " + hora);
                  break;   
               
              case 4:
                  cadena=cadena.concat("Jueves a las " + hora);
                  break;
              
              case 5:
                  cadena=cadena.concat("Viernes a las " + hora);
                  break;   
              
              case 6:
                  cadena=cadena.concat("Sabado a las " + hora);
                  break;   
              
              case 7:
                  cadena=cadena.concat("Domingo a las " + hora);
                  break;   
                 
          }
         //Si se corresponde con los dias y horas del calendario, completo la cadena con que tiene bus. En caso contrario con que no tiene.
         if(dia ==7 || hora==10 || hora==14 && dia!=6 || dia==3 && hora==13 || dia==4 && hora==12){
            
               cadena=cadena.concat(" tienes bus");
         }
         else cadena=cadena.concat(" no tienes bus. Mala suerte");
     
         System.out.println(cadena);
     }
     
     else System.out.println("Datos incorrectos");
     }
}
