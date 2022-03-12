package Clase4;
// Hacer un programa que solicite la carga desde consola de
// un carácter y realice: imprima si es dígito, o letra minúscula, o
// es cualquier otro carácter. Si es letra minúscula indicar si es
// vocal o consonante.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C4_ej_2_2 {
    public static void main(String[] args) {
        char c1;
        String j;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un carácter");
            c1 = entrada.readLine().charAt(0); 
            if ('0'<=c1 && c1<='9') {
                j = "Es dígito";
            } else if ('a'<=c1 && c1<='z') {
                j = "Es letra minúscula";
                if (c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u') {
                    System.out.println("Es vocal");
                } else {
                    System.out.println("Es consonante");
                }
            } else {
                j = "No es letra minúscula ni es dígito";
            }
            System.out.println(j);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}