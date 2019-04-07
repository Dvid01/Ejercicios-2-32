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
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner m = new Scanner (System.in);
        System.out.println("Digita los metros a convertir: ");
        double metros = m.nextDouble();
        
        double pies = metros*(3.28/1);
        System.out.println(metros + "m Equivalen a " + pies + "ft");    
    }
}
