// Escribir un programa que permita el ingreso de dos números enteros
// por teclado y realice:
// _ imprima A si el primero mayor al segundo,
// _ o imprima B si ambos son múltiplos de 2,
// _ o imprima C para ninguna de las opciones anteriores
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C4_Ej_1_2 {
    public static void main(String[] args) {
        int n1, n2;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            n1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro entero");
            n2 = Integer.valueOf(entrada.readLine());
            if (n1>n2) {
                System.out.println("A");
            } else if(n1%2==0 && n2%2==0) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
