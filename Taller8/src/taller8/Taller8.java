/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Taller8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DanielZota
        int one, two, three;
        Scanner no = new Scanner (System.in);
        
        System.out.println("Escriba el #1 ");// se pide por consola los úmeros
        one = no.nextInt();// se guarda los datos que ingreso el usuario
        System.out.println("Escriba el #2 ");// se pide por consola los úmeros
        two = no.nextInt();// se guarda los datos que ingreso el usuario
        System.out.println("Escriba el #3 ");// se pide por consola los úmeros
        three = no.nextInt();// se guarda los datos que ingreso el usuario
        
        if(one > two  && one < three || one < two && one > three){
            /** se instancia de que one"primer dato" debe ser mayor a two y menor que three
            u otra posibilidad que one debe ser menor que two y mayor que three y 
            * asi poder concluir que el intermedio sera el primer dato ingresado
            * de igual manera con los siguientes ejemplos teniendo como protagonista 
            * "two" y "three"
            */
            System.out.println("El intermedio es: "+ one);
            
        }else if (two > one && two < three || two < one && two > three ){
            System.out.println("El menor es: " +two);
            
        }else if( three > one  &&  three < two || three < one && three > two ){
            System.out.println("El menor es: " + three);
        }
                
    }
    
}
