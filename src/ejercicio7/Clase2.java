package ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<10 ; i++){
            String ip= sc.nextLine();
            String[] ArrayIp =ip.split("\\.");
            int primerosNumeros=Integer.parseInt(ArrayIp[0]);
            if (primerosNumeros<=223){
                System.out.println(ip);
            }
        }

        sc.close();

    }
}
