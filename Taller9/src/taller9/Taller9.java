/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller9;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Taller9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DanielZota
        Scanner cali = new Scanner(System.in);
        float not1, not2, not3, not4,promedio;
        
        System.out.println("Ingrsar nota #1");// se le referencia al usuario sobre las notas que debe ingresar
        not1 = cali.nextFloat();// guarda el dato ingresado
        System.out.println("Ingrsar nota #2");
        not2 = cali.nextFloat();
        System.out.println("Ingrsar nota #3");
        not3 = cali.nextFloat();
        System.out.println("Ingrsar nota #4");
        not4 = cali.nextFloat();
        
        if( not1 < not2 && not1 < not3 && not1 < not4){

/** aqui hacemos indicación de que si la nota #1 es menor que todas no arrojaria la 
 * siguiente operación 
 */
            System.out.println("No se tendra en cuenta La nota mas baja la cual es: "+not1 );
            //hacemos referencia y mostamos al usuario la nota mas baja y que no se tomara encuenta para el promedio
            promedio= (not2+not3+not4)/3;
            //hacemos la devida operación de la suma y la division no teniendo en cuenta la menor nota
            System.out.println(" la calificación final es "+ promedio);
            // se imprime el resultado 
        }else if (not2< not1 && not2< not3 && not2< not4){
            System.out.println("No se tendra en cuenta La nota mas baja la cual es: "+not2);
            promedio= (not1+not3+not4)/3;
            System.out.println(" la calificación final es "+ promedio);
            
        }else if (not3 < not1 && not3 < not2 && not3 < not4){
            System.out.println("No se tendra en cuenta La nota mas baja la cual es: "+not3);
            promedio= (not2+not1+not4)/3;
            System.out.println(" La calificación final es "+ promedio);
            
        }else if (not4 < not1 && not4< not2 && not4 < not3){
            System.out.println("No se tendra en cuenta La nota mas baja la cual es: "+not4);
            promedio= (not2+not3+not1)/3;
            System.out.println(" la calificación final es "+ promedio);
        }
        /**
         * vemos en los else if lo mismo que el primero pero cambiando 
         * el protagonista de las notas
         * 
         */
        
        
        
        
        
    }
    
}
