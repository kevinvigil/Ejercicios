// Escribir un programa que permita el ingreso de dos números
// enteros por teclado e imprima el resultado de comparar:
// _ el primero mayor al segundo.
// _ ambos son múltiplos de 2.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C3_Ej_3 {
    public static void main(String[] args) {
        int n1,n2;
        boolean j;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            n1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro entero");
            n2 = Integer.valueOf(entrada.readLine());
            j = n1>n2;
            System.out.println("el primero mayor al segundo: "+ j);
            j = n1%2==0 && n2%2==0;
            System.out.println("ambos son múltiplos de 2: "+j);
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
