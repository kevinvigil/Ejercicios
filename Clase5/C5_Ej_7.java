package Clase5;
// Escribir un programa que mientras que el usuario ingrese un número entero
// entre 1 y 10 inclusive, lleve la suma de los números ingresados y la cantidad
// de sumas que realizó. Finalmente, cuando sale del ciclo muestre por
// pantalla el resultado del promedio de todo lo ingresado.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C5_Ej_7 {
    public static void main(String[] args) {
        final int MAX = 10;
        final int MIN = 1;
        int number, suma = 0, count = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 10 y 1 inclusives");
            number = Integer.valueOf(entrada.readLine());
            while (number <= 10 && 1 <= number) {
                suma += number;
                count++;
                System.out.println("Ingrese otro numero entre 10 y 1 inclusives");
                number = Integer.valueOf(entrada.readLine());
            }
            System.out.println("El total es: "+suma);
            System.out.println("El promedio es: "+suma / count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
