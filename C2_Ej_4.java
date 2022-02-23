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
            nombre = entrada.readLine();
            System.out.println("Ingrese su apellido");
            apellido = entrada.readLine();
            System.out.println("Ingrese su edad");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su altura");
            altura = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese su ocupación");
            ocupacion = entrada.readLine();
            System.out.println("Ingrese su dirección");
            direccion = entrada.readLine();
            System.out.println("\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nAltura: "+altura+"\nOcupacion: "+ocupacion+"\nDireccion: "+direccion);

            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
