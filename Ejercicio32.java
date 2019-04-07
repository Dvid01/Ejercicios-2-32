/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner horas=new Scanner(System.in);
        System.out.println("Digita las horas (1-12)");
        int h = horas.nextInt();
        
        Scanner minutos=new Scanner(System.in);
        System.out.println("Digita los minutos (0-59)");
        int m = minutos.nextInt();
        
        Scanner segundos=new Scanner(System.in);
        System.out.println("Digita los segundos (0-59)");
        int s = segundos.nextInt();
        
        System.out.println(h+"h "+m+"m "+s+"s");
        System.out.println("La hora digitada mas 1s es: ");
        
        if(m == 59 && s == 59){
            System.out.println(h+1+"h "+"00m 00s");
        }else if(s==59){
            System.out.println(h+"h "+(m+1)+"m 00s");
        }else{
            System.out.println(h+"h "+m+"m "+(s+1)+"s");
        }

    }
    
}
