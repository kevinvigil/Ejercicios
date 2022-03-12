package Clase3;
// Escribir un programa que imprima por pantalla la tabla de valores
// de verdad para el or y and por separado.
public class C3_Ej_2 {
    public static void main(String[] args) {
        boolean t,f,j;
        t = true;
        f= false;
        j= t || f;
        System.out.println("t or f = "+j);
        System.out.println("f or t = "+j);
        j= t || t;
        System.out.println("t or t = "+j);
        j= f || f;
        System.out.println("f or f = "+j + "\n");

        j= t && f;
        System.out.println("t and f = "+j);
        System.out.println("f and t = "+j);
        j= t && t;
        System.out.println("t and t = "+j);
        j= f && f;
        System.out.println("f and f = "+j);
    }
}
