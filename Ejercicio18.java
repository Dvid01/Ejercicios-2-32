/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;


/**
 *
 * @author Rocio
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        
        int x = 3700;
        int h = x/3600;
        int r = x%3600;
        int m = r/60;
        int s = r%60;

        System.out.print(h+"h ");
        System.out.print(m+"m ");
        System.out.println(s+"s");

    }

}
