package ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clase = args[0];

        while (sc.hasNextLine()) {
            String ip = sc.nextLine();
            int primerosNumeros = Integer.parseInt(ip.split("\\.")[0]);

            if (primerosNumeros<=127 && clase.equals("A")) {
                System.out.println(ip);
            } else if (primerosNumeros>=128 && primerosNumeros<=191 && clase.equals("B")) {
                System.out.println(ip);
            } else if (primerosNumeros>=192 && primerosNumeros<=223 && clase.equals("C")) {
                System.out.println(ip);
            }
        }

        sc.close();
    }
}
