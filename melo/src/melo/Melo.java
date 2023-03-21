/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package melo;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Melo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int val1, val2, val3; //Se agrega las condiciones
         Scanner ver = new Scanner (System.in);  
         
         System.out.println("Escriba valor #1"); // se imprime en pantalla el mensaje al usuario
        val1 = ver.nextInt(); //Se guarda el valor que el usuario da
         System.out.println("Escriba valor #2");// se imprime en pantalla el mensaje al usuario
        val2= ver.nextInt();//Se guarda el valor que el usuario da
        System.out.println("Escriba valor #3");// se imprime en pantalla el mensaje al usuario
        val3 = ver.nextInt();//Se guarda el valor que el usuario da
        
        if (val1 > val2 && val1 > val3){
            System.out.println("El número maypr es: "+ val1);
        }
        else if (val2 > val1 && val2 > val3 ){
             System.out.println("El número mayor es : "+ val2);
    }
        else{
            System.out.println("El número mayor es: " + val3);
        
        }
         
    }
    
}
