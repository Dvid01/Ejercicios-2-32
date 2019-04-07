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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Base del tringulo: ");
        double base = b.nextDouble();
        
        Scanner h = new Scanner(System.in);
        System.out.println("Altura del tringulo: ");
        double altura = h.nextDouble();
        
        double area = (base*altura)/2;
        System.out.println("El area del triangulo es = " + area);
                       
    }  
}