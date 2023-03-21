
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallertresdetres;
//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author cd
 */
public class TallertresdeTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //DanielZota
        Scanner pant = new Scanner(System.in);
        
        double r, h, aret, volt; //Se declara las variables
        
        
        System.out.println("Ingrese el radio del cilindro "); //se le pide al usuario que ingrese el radio del cilindro
        r = pant.nextDouble(); //Se guarda el valor que ingresa el usuario
        
        System.out.println("Ingrese la altura del cilindro ");//se le pide al usuario que ingrese la altura  del cilindro
        h = pant.nextDouble();//Se guarda el valor que ingresa el usuario
        
        aret= ((2)*(3.14)*(r)) * (r+h); //Es la formula para allar el area
        volt = (3.14) * (r*r) * (h); // es la formula para allar el volumen
        
        System.out.println("El area del cilindro es: "+ aret + "cm2"); //Se imprime el area para que el usuario lo vea 
        System.out.println("El volumen del cilindro es " + volt + "cm3"); // Se imprime el volumen para el usuario lo vea
    }
}


