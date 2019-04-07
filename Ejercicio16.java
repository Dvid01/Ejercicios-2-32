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
public class Ejercicio16 {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Digita el cateto a: ");
        double catetoa = a.nextDouble();
        
        Scanner b = new Scanner(System.in);
        System.out.println("Digita el cateto b: ");
        double catetob = b.nextDouble();
        
        double c = Math.pow(catetoa,2) + Math.pow(catetob,2);
        double hipotenusa = Math.sqrt(c);
        
        System.out.println("La hipotenusa es = " + hipotenusa);        
    }
    
}
