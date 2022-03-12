package Clase4;
// El astrónomo Metón de Atenas descubrió hacia el siglo V a.C que la luna
// repite su ciclo cada 19 años (el mismo día del mismo mes tendrá la misma
// fase lunar). Sus aportes permitieron determinar la fase de la luna para una
// fecha dada. Los pasos para obtener esa información son:


// A. Calcular el número áureo: permite conocer en qué año-tipo del ciclo
// nos encontramos considerando la repetición de ciclos cada 19 años.
// El número áureo se calcula de la siguiente forma:
// – Tomamos la cifra del año que nos interesa (por ejemplo 2023) y le sumamos 1
// (2023+1=2024)
// – A continuación dividimos el resultado por 19 (ciclo de repetición) y nos
// quedamos con el resto 2024/19 = 106 resto = 10 (10 es el resto entre 2024 y 19). Al
// dividir por 19 hemos eliminado los ciclos repetidos. Así el número áureo es 10.

// B  Calcular la epacta: es la edad de la luna en días el 1 de enero del
// año elegido, y se calcula de la siguiente forma:
// – Se resta 1 del número áureo, y se multiplica por 11 (en nuestro caso 10-1 = 9; 9*11 = 99)
// – Después, se divide por 30 (un mes lunar) y de nuevo nos quedamos con el resto:
// 99/30 = 3 resto = 9. Significa que el 1 de enero de 2023 habrán pasado 9 días
// desde la última luna nueva.

// C  Finalmente, para saber la edad lunar en un día cualquiera,
// (supongamos el 15 de junio de 2023) realizaremos la siguiente
// operación:

// 1) A la epacta (9) le sumamos 1 por cada mes a partir de marzo (por
// ejemplo: de marzo a junio sumamos 4, y si el mes fuera enero de
// marzo a enero sumamos 11), y luego le sumamos el día del mes
// requerido (15), es decir 9+4+15=28.
// 2) 28 es la edad lunar para esa fecha, y si pasara de 29 habría que
// reducirlo obteniendo el resto de dividir por 30.
// 3) Es decir que el 15 de junio de 2023 habrán pasado 28 días desde la
// última luna nueva, por lo que la luna será menguante casi nueva (a
// falta de un día aproximadamente).

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C4_Ej_2_4 {
    public static void main(String[] args) {
        int anio, mes, dia, n_aureo, n_pacta, result;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese numero de anio");
            anio = Integer.valueOf(entrada.readLine()); 
            System.out.println("Ingrese numero de mes");
            mes = Integer.valueOf(entrada.readLine()); 
            System.out.println("Ingrese numero de dia");
            dia = Integer.valueOf(entrada.readLine()); 
            n_aureo = numero_de_aureo(anio);
            n_pacta = Calculo_de_pacta(n_aureo);
            if (mes == 1) {
                mes = 11;
            } else if (mes == 2){
                mes = 12;
            }
            result = n_pacta + mes - 2 + dia;
            if (result>29) {
                result = result%30;
            }
            System.out.println("La edad de la luna es de: " + result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int numero_de_aureo (int anio) { // A
        int aureo;
        aureo = (anio + 1)%19;
        return aureo;
    }

    public static int Calculo_de_pacta(int aureo) { // B
        int pacta;
        pacta = ((aureo-1)*11)%30;
        return pacta;
    }
}