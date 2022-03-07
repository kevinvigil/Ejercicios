// Hacer un programa que solicite la carga desde consola de un
// numero entero y realice:
// _si el numero es positivo, imprima “grande” si es mayor a 100 o “chico “ si
// es menor. Además deberá imprimir que el valor es positivo.
// _si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o
// ninguna de las opciones anteriores.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C4_ej_2_1 {
    public static void main(String[] args) {
        int n1;
        String j;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            n1 = Integer.valueOf(entrada.readLine()); 
            if (n1>0) {
                if (n1>100) {
                    j = "grande";
                } else {
                    j = "chico";
                }
                System.out.println("El valor es positivo");
                System.out.println(j);
            } else {
                if (n1%2==0) {
                    j ="El numero es par";
                } else if (n1%3==0) {
                    j ="El numero es múltiplo de 3";
                } else {
                    j ="El numero no cumple con nada de lo solicitado";
                }
                System.out.println(j);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
