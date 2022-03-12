package Clase5;
// Escribir un programa que mientras que el usuario ingrese un caracter dígito
// o caracter letra minúscula, imprima si es caracter dígito o caracter letra
// minúscula, y si es letra minúscula imprimir si es vocal o consonante.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C5_Ej_5 {
    public static void main(String[] args) {
        char c; 
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero o letra minuscula");
            c = entrada.readLine().charAt(0);
            while ((c>='0' && c<='9') || (c>='a' && c<='z')) {
                if (c>='0' && c<='9') {
                    System.out.println("Es digito");
                } else if (c>='a' && c<='z') {
                    if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                        System.out.println("Es vocal");
                    } else{
                        System.out.println("Es consonante");
                    }
                }
                System.out.println("Ingrese un entero o letra minuscula");
            c = entrada.readLine().charAt(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}