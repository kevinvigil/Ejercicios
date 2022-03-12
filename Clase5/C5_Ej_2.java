package Clase5;
// Escribir un programa que solicite al usuario el ingreso de un número entero
// positivo, y muestre por pantalla los valores entre el numero ingresado y 0
// de manera decreciente.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C5_Ej_2 {
    public static void main(String[] args) {
        int number;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero menor de 10 y mayor a 1");
            number = Integer.valueOf(entrada.readLine());
            while (number>0) {
                number --;
                System.out.println(number);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
