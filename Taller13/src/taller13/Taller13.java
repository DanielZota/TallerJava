/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller13;
import java.util.Scanner;
/**
 *
 * @author cd
 */
public class Taller13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DanielZota
        Scanner as= new Scanner (System.in);
        int num1,num2,num3,num4, mayor = 0,medio=0,menor = 0;
        
        System.out.println("#1 ");
        num1 = as.nextInt();
        System.out.println("#2 ");
        num2 = as.nextInt();
        System.out.println("#3 ");
        num3 = as.nextInt();
        System.out.println("#4 ");
        num4 = as.nextInt();
        
        if(num1 > num2  && num1 > num3 && num1 > num4){
            mayor = num1;
        }else if (num2 > num1  && num2 > num3 && num2 > num4){
            mayor= num2;
        }else if(num3 > num1  && num3 > num2 && num3 > num4){
            mayor = num3;
        }else if (num4 > num1  && num4 > num2 && num4 > num3){
        mayor = num4;
        }
        
        if(num1< num2 && num1< num3 &&num1 < num4){
        menor= num1;
        } else if(num2< num1 && num2< num3 &&num2 < num4){
        menor = num2;
        }else if(num3< num1 && num3< num2 &&num3 < num4){
        menor = num3;
        }else if (num4< num1 && num4< num2 &&num4 < num3){
        menor= num4;
        }
            
            medio = ( num1+num2+num3+num4)- (mayor + menor);
            System.out.println(""+menor+""+ medio+""+mayor);
            
    }
    
}
