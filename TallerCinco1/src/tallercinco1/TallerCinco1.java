/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercinco1;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class TallerCinco1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //DanielZota
        int uno, dos;//Declarar las variables
        Scanner ver = new Scanner (System.in);
        
        System.out.println("Ingrse el pimer número: ");
        uno = ver.nextInt();
        System.out.println("Ingrese el segundo número");
        dos = ver.nextInt();
        
        if (uno < dos ){ //Se da la condicion
            System.out.print("El menor es: "+uno); //Hacemos que imprima primero el número uno sin salto de linea
            System.out.print(","+dos);
        }else {
            System.out.print("El menor es: "+dos); //Aqui hacemos lo mismo que el anterior pero cambiando el orden
            System.out.println(","+uno);
        }
        
    }
    
}
