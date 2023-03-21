/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercuatro;
import java.util.Scanner;

/**
 *
 * @author cd
 */
public class TallerCuatroo {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        
//DanielZota
        int par;
        Scanner opt = new Scanner (System.in);
        
        System.out.println("Ingrese número a verificar");
        par = opt.nextInt();
                if ( par %2 ==0 ){

            System.out.println("El número si es par ");
        }
        
        else {
            System.out.println("No es par el número ingresado");
        }
    }
    
}
