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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Km recorridos por el proyectil: ");
        double distancia = (x.nextDouble())*(1000/1);
        
        Scanner t = new Scanner(System.in);
        System.out.println("minutos gastados durante el recorrido: ");
        double tiempo = (t.nextDouble())*(60/1);
        
        double velocidad = distancia/tiempo;
        System.out.println("la velocidad del proyetil es: "+ velocidad + "m/s");
    }
}
