package ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String ip = sc.nextLine();
            String[] ArrayIp = ip.split("\\.");
            int primerosNumeros = Integer.parseInt(ArrayIp[0]);

            if (primerosNumeros >= 0 && primerosNumeros<=127) {
                System.out.println(ip + " Clase A");
            } else if (primerosNumeros>=128 && primerosNumeros<=191) {
                System.out.println(ip + " Clase B");
            } else if (primerosNumeros>=192 && primerosNumeros<=223) {
                System.out.println(ip + " Clase C");
            }
        }
    }
}
