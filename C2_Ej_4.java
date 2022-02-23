// Escribir un programa que solicite los siguientes datos de una persona (nombre,
// apellido, edad, altura, ocupación, dirección) y los imprima por pantalla.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C2_Ej_4 {
    public static void main(String[] args) {
        String nombre, apellido, ocupacion, direccion;
        int edad;
        double altura;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese su nombre");
            System.out.println("Ingrese su apellido");
            System.out.println("Ingrese su edad");
            System.out.println("Ingrese su altura");
            System.out.println("Ingrese su ocupación");
            System.out.println("Ingrese su dirección");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
