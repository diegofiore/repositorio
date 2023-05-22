/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package ejercicios.java.intro;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author diego
 */
public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese una frase");
         String frase = leer.nextLine();
         
         frase = toUpperCase(frase);
         
         System.out.println("La frase en mayúsculas es: " + frase);
         
         frase = toLowerCase(frase);
         
          System.out.println("La frase en mayúsculas es: " + frase);
         
         
         
    
    
}}
