/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Taller12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DanielZota
        Scanner saldo = new Scanner (System.in);
        float monto, desc, total;
        System.out.println("Ingrese el monto del pago");
        monto = saldo.nextInt();
        
        if(monto > 100){
            desc = (float) (monto * 0.10);
            total =(float) (monto-desc);
            System.out.println("su descuento es del 10%, debe pagar: "+ total);
        }else if (monto > 50 && monto <= 100){
            desc = (float) (monto *0.02);
            total= (float) (monto-desc);
            System.out.println("su descuento es del 2%, debe pagar: "+ total);
        }else if (monto <= 50){
            System.out.println("No hay descuento, debe pagar: "+ monto);
        }
    }
    
}
