package Clase4;
// Construir un programa que solicite desde teclado un número de
// mes y posteriormente notifique por pantalla la cantidad de días
// de ese mes. En el caso de que ingrese 2 como número de mes
// (febrero), para imprimir la cantidad de días deberá solicitar
// ingresar un número de anio (no usar ñ), para determinar si es
// bisiesto o no con la siguiente sentencia:
// _si ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) es verdadero,
// entonces es bisiesto.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C4_ej_2_3 {
    public static void main(String[] args) {
        int mes, anio;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un mes");
            mes = Integer.valueOf(entrada.readLine()); 
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Este mes tiene 31");
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println("Este mes tiene 30");
            } else if (mes == 2) {
                System.out.println("Ingrese un año");
                anio = Integer.valueOf(entrada.readLine()); 
                if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                    System.out.println("Este mes tiene 29");
                } else {
                    System.out.println("Este mes tiene 28");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
