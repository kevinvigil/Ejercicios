package Clase4;
// Escribir un programa que permita el ingreso de un carácter y realice:
// _ imprima es carácter dígito si el carácter ingresado es carácter
// dígito,
// _ o imprima no es carácter dígito
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C4_Ej_1_1 {
    public static void main(String[] args) {
        char c;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter");
            c = entrada.readLine().charAt(0);
            if (c >= '0' && c <= '9') {
                System.out.println("El caracter es un digito");
            } else {
                System.out.println("El caracter no es un digito");
            }
            System.out.println("El caracter es "+ c);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
