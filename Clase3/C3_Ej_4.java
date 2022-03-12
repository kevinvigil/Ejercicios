package Clase3;
// Escribir un programa que ingrese un número entero por teclado e
// imprima el resultado de determinar:
// _ es múltiplo de 6 y de 7,
// _ es mayor a 30 y múltiplo de 2, o es menor igual a 30,
// _ el cociente de la división de dicho número con 5 es mayor a 10.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C3_Ej_4 {
    public static void main(String[] args) {
        int n1;
        boolean j;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un entero");
            n1 = Integer.valueOf(entrada.readLine());
            j = n1%6==0 && n1%7==0;
            System.out.println("Es múltiplo de 6 y de 7: "+ j);
            j = (n1>30 && n1%2==0) || n1 <=30;
            System.out.println("Es mayor a 30 y múltiplo de 2, o es menor igual a 30: "+j);
            j = n1/5 > 10;
            System.out.println("El cociente de la división de dicho número con 5 es mayor a 10: "+j);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
