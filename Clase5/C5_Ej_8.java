package Clase5;
// Escribir un programa que mientras el usuario ingrese un caracter letra
// minúscula, acumule la cantidad de vocales que ingreso. Finalmente
// muestre por pantalla dicha cantidad.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C5_Ej_8 {
    public static void main(String[] args) {
        char letters;
        int vowels = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese letras minuscula");
            letters = entrada.readLine().charAt(0);
            while (letters <= 'z' && letters >= 'a') {
                if (letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u') {
                    vowels ++;
                }
                System.out.println("Ingrese letras minuscula");
                letters = entrada.readLine().charAt(0);
            }
            System.out.println("La cantidad de vocales es: "+ vowels);
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}