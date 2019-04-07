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
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Digita el numero a dividir: ");
        int dividendo = a.nextInt();
        
        Scanner b = new Scanner (System.in);
        System.out.println("Digita el numero Divisor: ");
        int divisor = b.nextInt();
        
        int division = dividendo/divisor;
        int residuo = dividendo%divisor;
        System.out.println(dividendo+"/"+divisor+"= "+division);
        System.out.println("residuo= "+residuo);

    }
}
