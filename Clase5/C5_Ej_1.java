package Clase5;
// Escribir un programa que mientras el usuario ingrese un número entero
// menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
// 2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados deberían
// ser constantes?. De a poco habría que definirlos como constantes).


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C5_Ej_1 {
    public static void main(String[] args) {
        final int max = 10;
        final int min = 1;
        int number;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero menor de 10 y mayor a 1");
            number = Integer.valueOf(entrada.readLine());
            while (number>1 && number<10) {
                if (number % 2 ==0 && number % 3 ==0) {
                    System.out.println("El numero "+number+" es multiplo de 2 y 3");
                } else {
                    System.out.println("El numero "+number+" no es multiplo de 2 y 3");
                }
                System.out.println("Ingrese un numero menor de 10 y mayor a 1");
                number = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
