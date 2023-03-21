/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller11;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Taller11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DanielZota
        Scanner orden = new Scanner (System.in);
        int or1, or2,or3;
        
        System.out.println("Ingrese valor 1: ");//Se pide al usuario que ingrese valores
        or1 = orden.nextInt();// Guarda el valor que da el usuario
        System.out.println("Ingrese valor 2: ");
        or2 = orden.nextInt();
        System.out.println("Ingrese valor 3: ");
        or3 = orden.nextInt();
        
        System.out.println(" Mayor a menor"); //Hacemos referencia sobre que se va a ordenar de mayor a menor
        
        if (or1> or2 && or1 >or3 && or2 > or3){//damos a entender que debe ser el primer valor mayor que todos
            System.out.println(""+or1+","+ or2+"," + or3);//Hacemos referencia a como se van a comodar los valores
        }else if (or1> or2 && or1 >or3 && or3 > or2){/**
         * Se posiciona el valor 1 como mayor pero esta es la opcion si el tercer
         * valor es mayor que el segundo, de igual manera se le da la posición
         */
            System.out.println(""+or1+","+ or3+"," + or2);   
        }else if (or2 > or1 && or2> or3 && or1>or3){
            System.out.println(""+or2+","+or1+","+or3);
        }else if(or2 > or1 && or2> or3 && or3>or1){
            System.out.println(""+or2+","+or3+","+or1);
        }else if(or3 > or1 && or3> or2 && or1>or2){
            System.out.println(""+or3+","+or1+","+or2);
        }else if (or3 > or1 && or3> or2 && or2>or1){
            System.out.println(""+or3+","+or2+","+or1);
        }
        
        {
        System.out.println("Menor a mayor");
        /**
         hacemos lo mismo que en la anterior conndiciones pero con los valores menores
         * entre menor la cantidad ingresada, posición de primeras
         */
        if (or1< or2 && or1 <or3 && or2 < or3){
            System.out.println(""+or1+","+ or2+"," + or3);
        }else if (or1< or2 && or1 <or3 && or3 < or2){
            System.out.println(""+or1+","+ or3+"," + or2);   
        }else if (or2 < or1 && or2< or3 && or1<or3){
            System.out.println(""+or2+","+or1+","+or3);
        }else if(or2 < or1 && or2< or3 && or3<or1){
            System.out.println(""+or2+","+or3+","+or1);
        }else if(or3 < or1 && or3< or2 && or1<or2){
            System.out.println(""+or3+","+or1+","+or2);
        }else if (or3 < or1 && or3< or2 && or2<or1){
            System.out.println(""+or3+","+or2+","+or1);
        }
    }
    
}
}
    

