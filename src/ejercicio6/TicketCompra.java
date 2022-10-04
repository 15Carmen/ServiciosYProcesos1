package ejercicio6;

import java.util.Scanner;

public class TicketCompra {
    public static void main(String[] args) {
        int codigoProduct, cantidadProduct;
        double precioProduct, total;

        Scanner sc = new Scanner(System.in);

        codigoProduct= sc.nextInt();
        precioProduct= sc.nextDouble();
        cantidadProduct= sc.nextInt();

        total=precioProduct*cantidadProduct;
        System.out.printf("%d - %.2f - %d - %.2f\n", codigoProduct, precioProduct, cantidadProduct, total);
        sc.close();


    }
}
