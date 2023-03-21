/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller10;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Taller10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DanielZota
        Scanner pita = new Scanner (System.in);
        int a,b,c;
        System.out.println("Ingrese el valor del lado a");
        a = pita.nextInt();
        System.out.println("Ingrese el valor de b");
        b= pita.nextInt();
        System.out.println("Ingrese el valor de c");
        c = pita.nextInt();
        
        if (a == b && a== c && b==c){
            System.out.println("Es un triangulo Equilatero");
            //Equilatero, todos los lados son iguales
        }else if (a ==b && b!= c || b==c && c!=a || a==c && c!=b ){
            System.out.println("Es un triangulo Isósceles");
            // Isosceles,dos lados son iguales y uno diferente
            
        }else if ( a != b && a!=c && b!=c){
            System.out.println("Es un triangulo Escaleno");
            //Escaleno todos los lados son diferentes
        }
        
    }
    
}
