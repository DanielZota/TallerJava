/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller6;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Taller6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//xhhxsyxhysxhysx
        //DanielZota
        Scanner escrib = new Scanner (System.in);//djcujdcujcdu
        float  per,total; 
        
        System.out.println("¿A cuantos km/h va el automóvil?");
        per = escrib.nextFloat();
        
       total = per *1000 / 3600;
        
        System.out.println("Los metros por segundo son:" +total );
    }
            
    
}
