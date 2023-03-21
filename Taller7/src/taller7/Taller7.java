
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller7;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DanielZota
        int uno, dos, tres;//Declarar las variables
        Scanner ol = new Scanner (System.in);
        
        System.out.println("Ingrse el pimer número: ");
        uno = ol.nextInt();
        System.out.println("Ingrse el segundo número: ");
        dos = ol.nextInt();
        System.out.println("Ingrse el tercer número: ");
        tres = ol.nextInt();
        
        if (uno < dos && uno < tres ){ //Se da la condicion
            System.out.print("El menor es: "+uno); //Hacemos que imprima primero el número uno sin salto de linea
        } else if (dos< uno && dos< tres){
            System.out.println("El menos es: "+dos);
        }else {
            System.out.println("El menor es: "+tres);
        }
    }
    
}
