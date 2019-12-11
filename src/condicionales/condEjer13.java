/*
 * Diseñar un algoritmo al que se le introduzcan DIA, MES, AÑO, que calcule el día siguiente.
Suponemos que los valores son correctos, , sin emplear las clases de fechas de Java.
 */
package condicionales;

import java.util.*;

public class condEjer13 {
     public static void main(String [] args){
     
        Scanner teclado = new Scanner(System.in);
        int dia,mes, anio;
        boolean bisiesto=false;
     
        System.out.println("Introduce dia: ");
        dia=teclado.nextInt();
     
        System.out.println("Introduce mes: ");
        mes=teclado.nextInt();
     
        System.out.println("Introduce año: ");
        anio=teclado.nextInt();
        
        //Uso un booleano para saber si el año es bisiesto, por temas de limpieza de codigo. Empiezo asumiendo que no es bisiesto
        if((anio%100!=0 && anio%4==0) || anio%400==0){
         bisiesto=true;
        }
        
        //Compruebo que los datos son correctos
        if(dia>=1 && dia<=31 && mes >=1 && mes<=12){
            if((dia>28 && mes==2 && bisiesto!=true)|| (dia>29 && mes==2 && bisiesto==true) || (dia>30 &&(mes==4||mes==6||mes==9||mes==11))) 
                System.out.println("El mes "+mes+" no tiene dia " +dia + ". Recuerda que los bisiestos son tenidos en cuenta");
            
            //si son correctos sumo un año en el ultimo dia del año, 1 mes en el ultimo dia de otro mes o un dia en el resto de casos
            else{ 
                    if(mes==12 && dia==31){
                    dia=1; mes=1; anio+=1;
                }
                    else if(dia==31 || ((dia==28 || dia==29) && mes==2) || (dia==30 && (mes==4||mes==6||mes==9||mes==11))){
                    dia=1; mes+=1;  
                }
      
                    else dia+=1;
                    
                    System.out.println("La fecha siguiente seria " + dia + "-" + mes + "-" + anio);
                }
        }
        else System.out.println("La has pifiado en los datos. Dias 1-31, meses 1-12");
     }
}
