package ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        String[] comando = {"java", "src/ejercicio7/Clase1.java"};
        ProcessBuilder pb = new ProcessBuilder(comando);

        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        try {
            Process p = pb.start();
            p.waitFor();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
