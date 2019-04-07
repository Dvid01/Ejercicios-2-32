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
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int n1 = numero1.nextInt();
        
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Numero 2: ");
        int n2 = numero2.nextInt();
        
        if(n1 > n2){
            System.out.println(n2+" es mayor que "+n1);
            
        }else{
            System.out.println(n2+" es mayor que "+n1);
        }    
    }
}
