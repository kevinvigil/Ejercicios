// Escribir un programa que permita el ingreso de un número entero
// por teclado e imprima el cociente de la división de dicho número
// con 2, 3, y 4.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C3_Ej_1 {
    public static void main(String[] args) {
        double numero,n2, n3, n4;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un entero");
            numero = Double.valueOf(entrada.readLine());
            n2 = numero/2;
            System.out.println("cociente de la división con 2 es: "+ n2);
            n3 = numero/3;
            System.out.println("cociente de la división con 3 es: "+ n3);
            n4 = numero/4;
            System.out.println("cociente de la división con 4 es: "+n4);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
}