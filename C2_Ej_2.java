// Escribir un programa que declare tres variables de tipo double y
// una constante de tipo double con valor 1.0 . Luego deberá
// asignar el valor de la constante a una de la variables declaradas,
// y posteriormente sobre las dos restantes variables se le deberá
// asignar el valor de la variable que inicialmente fue seteada con el
// valor de la constante. Finalmente imprima por pantalla cada una
// de las variables.
public class C2_Ej_2 {
    public static void main (String[] args){
        final double pi = 3.14;
        double n = 3.14;
        double pi2 = pi;
        double pi3 = pi2;
        
        System.out.println("pi: "+pi + "\nn: " + n +"\npi2: " + pi2 +"\npi3: " + pi3);
    }
}
