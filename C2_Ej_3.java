// Escribir un programa que solicite y luego muestre por consola los valores
// necesarios para dibujar un círculo y un triángulo. Hay que determinar en cada
// caso que constantes (que no se cargan por consola) y variables con tipos son
// necesarias declarar.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C2_Ej_3 {
    public static void main (String[] args) {
        double radio, lado1, lado2, angulo;
        int tipo;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el radio del circulo: ");
            radio = Double.valueOf(entrada.readLine());
            System.out.println("El circulo tendra un radio de: "+radio+"\nY un diametro de: "+ 2*radio);

            System.out.println("Si el triangulo es rectangulo ingrese 1 si no 2");
            tipo = Integer.valueOf(entrada.readLine());
            if (tipo == 1) {
                System.out.println("Ingrese el valor del lado 1: ");
                lado1 = Double.valueOf(entrada.readLine());
                System.out.println("Ingrese el valor del lado 2: ");
                lado2 = Double.valueOf(entrada.readLine());
            } else if(tipo == 2) {
                System.out.println("Ingrese el valor del lado 1: ");
                lado1 = Double.valueOf(entrada.readLine());
                System.out.println("Ingrese el valor del lado 2: ");
                lado2 = Double.valueOf(entrada.readLine());
                System.out.println("Ingrese el valor del angulo entre ambos lados: ");
                angulo = Double.valueOf(entrada.readLine());
            } else {
                System.out.println("el numero no se encuentra dentro de las opciones");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}