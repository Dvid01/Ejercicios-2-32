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
public class Ejercicio12 {
    public static void main(String[] args) {
        
        System.out.println("(a+7*c)/((b+2-a)+2*b)");
        
        Scanner vlra = new Scanner(System.in);
        System.out.println("Digite el valor de a: ");
        double a = vlra.nextDouble();
        
        Scanner vlrb = new Scanner(System.in);
        System.out.println("Digite el valor de b: ");
        double b = vlrb.nextDouble();
        
        Scanner vlrc = new Scanner(System.in);
        System.out.println("Digite el valor de c: ");
        double c = vlrc.nextDouble();
        
        double result = (a+7*c)/((b+2-a)+2*b);
        
        System.out.println("El resultado de la ecuacion es = "+result);
    }
}
