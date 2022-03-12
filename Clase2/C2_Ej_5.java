package Clase2;
// Escribir un programa que pida que se ingresen datos necesarios para emitir una
// factura por la compra de dos artículos de librería (tipo factura, número, nombre
// cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
// salida debe imprimir por pantalla la factura en un formato similar al siguiente
// (utilizar literales):
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class C2_Ej_5 {
    public static void main(String[] args) {
        String tipo_factura, nombre_cliente, producto1, producto2;
        int numero;
        double importe1, importe2, total;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese su tipo factura");
            tipo_factura = entrada.readLine();
            System.out.println("Ingrese su numero");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el nombre del cliente");
            nombre_cliente = entrada.readLine();
            System.out.println("Ingrese el producto n1");
            producto1 = entrada.readLine();
            System.out.println("Ingrese el importe del producto n1");
            importe1 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese el producto n2");
            producto2 = entrada.readLine();
            System.out.println("Ingrese el importe del producto n2");
            importe2 = Double.valueOf(entrada.readLine());
            total = importe1+importe2;
            System.out.println("Factura\t\t"+tipo_factura+"\t\t"+numero+"\n"+
                                "Nombre\t\t"+nombre_cliente+"\n"+
                                "Producto\t\t\tImporte"+"\n"+
                                producto1+"\t\t\t\t"+importe1+"\n"+
                                producto2+"\t\t\t\t"+importe2+"\n"+
                                "Total"+"\t\t\t\t"+total);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}