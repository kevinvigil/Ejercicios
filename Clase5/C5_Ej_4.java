package Clase5;
// Escribir un programa que mientras que el usuario ingrese un número entero
// distinto de 0, pida ingresar otro número entero y lo imprima.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C5_Ej_4 {
    public static void main(String[] args) {
        int entero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            entero = Integer.valueOf(entrada.readLine());
            while (entero != 0) {
                System.out.println("Ingrese un entero");
                entero = Integer.valueOf(entrada.readLine());
                System.out.println("El numero es: "+entero);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}