/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerdos;
import java.util.Scanner;

/**
 *
 * @author cd
 */
public class TallerDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DanielZota
        Scanner leer = new Scanner(System.in);
        int num, i,suma=0;
        
        System.out.println("Agrega 5 valores del 1 al 10 "); //Se da la condicion al usuario
        
        for (  i=0; i < 5; i++){ //La variable "i" nos va a acumular lo que el usuario ingrese
            num = leer.nextInt(); //Aqui la variable "num" es lo que el usuario va agregar
        suma = suma + num ; //La "suma" desde un comienzo la instanciamos de uqe debe de valer "0" para que nos acumule los rtesultados
        
        }
        
        System.out.println("Suma total es: "+ suma); // Se imprime en panatlla el resultado total de los númeroa que ingreso el usuario 
        
    }
}
