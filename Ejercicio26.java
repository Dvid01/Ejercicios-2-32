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
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int n = numero.nextInt();
        
        if (n % 2 == 0 ) {
            System.out.println(n + " es un numero par");
        }else{
            System.out.println(n + " es un numero impar");
        }    
    }
    
    
}
