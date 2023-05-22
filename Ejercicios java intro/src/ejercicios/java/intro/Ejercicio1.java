/*
     *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
     */
package ejercicios.java.intro;

/**
 *
 * @author diego
 */
import java.util.Scanner;
public class Ejercicio1 {
   

 

  
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
                 
        int num1 = 0;
        int num2 = 0;
        int suma;
        
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese otro número");
        
        num2 = leer.nextInt();
                
        suma = num1 + num2;        
                
        System.out.println("La suma de los 2 números ingresados es: " + suma);
    }
    
}
