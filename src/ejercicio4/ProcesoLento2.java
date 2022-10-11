package ejercicio4;

import java.io.File;
import java.io.IOException;

public class ProcesoLento2 {
    public static void main(String[] args) {
        String[] comando = {"java", "src/ejercicio2/ProcesoLento.java"};
        ProcessBuilder pb = new ProcessBuilder(comando);
        File fichero = new File("C:\\Users\\cmartin\\IntelliJ\\SistemasYProcesos1\\src\\ejercicio4\\salidaProcesoLento.txt");
        pb.redirectOutput(fichero); //redirijo la salida del proceso a un fichero de texto
        //pb.inheritIO();

        try {
            Process p = pb.start();
            while (p.isAlive()){ //mientras el proceso funcione
                System.out.println("Sigue en ejcución"); //imprimo este mensaje
                Thread.sleep(3000); //espera 3 segundos
            }
            System.out.println("El proceso ha terminado");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
