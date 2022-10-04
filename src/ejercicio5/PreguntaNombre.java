package ejercicio5;

import java.util.Scanner;

public class PreguntaNombre {
    public static void main(String[] args) {
        String nombre;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        nombre=sc.nextLine();

        System.out.println("¡Hola "+nombre+"!");
        sc.close();
    }
}
