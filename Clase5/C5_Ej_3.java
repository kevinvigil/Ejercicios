package Clase5;
// Escribir un programa que mientras el usuario ingresa un caracter distinto
// del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
// vocal minúscula.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C5_Ej_3 {
    public static void main(String[] args) {
        char a;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter, para salir ingrese *");
            a = entrada.readLine().charAt(0);
            while (a != '*') {
                if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
                    System.out.println("Es vocal");
                } else if (a>='0' && a<='9') {
                    System.out.println("Es digito");
                } else {
                    System.out.println("No es digito ni vocal");
                }
                System.out.println("Ingrese un caracter, para salir ingrese *");
                a = entrada.readLine().charAt(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
