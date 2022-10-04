package ejercicio3;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el comando a ejecutar: ");

        String[] comando = sc.nextLine().split(" ");

        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.inheritIO();

        try {
            Process p = pb.start();
            p.waitFor();
            System.out.println("El proceso ha terminado");

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
