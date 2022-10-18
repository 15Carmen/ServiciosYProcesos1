package ejercicio11;

import java.io.*;

public class LanzarVariosProcesos2 {
    public static void main(String[] args) {
    String[] comando1 = {"cmd", "/C", "type", "nul", ">", "C:\\pruebas\\carpeta1\\fichero2.txt"};
    String[] comando2= {"notepad", "fichero2.txt"};
    ProcessBuilder pb1 = new ProcessBuilder(comando1);
    ProcessBuilder pb2 = new ProcessBuilder(comando2);

    Runtime r = Runtime.getRuntime();

    pb1.inheritIO();
    pb2.inheritIO();

    try {
        Process p1 = pb1.start();
        p1.waitFor();
        Process p2 = pb2.start();
        p2.waitFor();

    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}
}
