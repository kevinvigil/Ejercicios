package Clase5;
// Escribir un programa que mientras el usuario ingrese un caracter letra
// minúscula, se quede con la menor y la mayor letra ingresada. Finalmente
// muestre por pantalla dichas letras.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C5_Ej_9 {
    public static void main(String[] args) {
        char letters, major, minor;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese letras minuscula");
            letters = entrada.readLine().charAt(0);
            if (letters <= 'z' && letters >= 'a'){
                minor = letters;
                major = letters;
                System.out.println("Ingrese letras minuscula");
                letters = entrada.readLine().charAt(0);
                while (letters <= 'z' && letters >= 'a') {
                    if (letters < minor ) {
                        minor = letters;
                    } else if (letters > major) {
                        major = letters;
                    }
                    System.out.println("Menor"+minor);
                    System.out.println("Mayor"+major);
                    System.out.println("Ingrese letras minuscula");
                    letters = entrada.readLine().charAt(0);
                } 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}