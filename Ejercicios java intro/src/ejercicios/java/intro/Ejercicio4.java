/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios.java.intro;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ejercicio4 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("ingrese temperatura en grados centígrados");
         float tempCenti= leer.nextFloat();
         
         float tempFahren = 32 + (9*tempCenti/5);
         
         System.out.println("La temperatura en Fahrenheit es: "+ tempFahren);
         
}}
