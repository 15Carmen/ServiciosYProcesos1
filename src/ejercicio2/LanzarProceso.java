package ejercicio2;

import java.io.IOException;

public class LanzarProceso {
    public static void main(String[] args) {
        String[] comando = {"java", "src/ejercicio2/ProcesoLento.java"};
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.inheritIO();

        try {
            Process p = pb.start();
            while (p.isAlive()){ //mientras el proceso funcione
                System.out.println("Sigue en ejcución"); //imprimo este mensaje
                Thread.sleep(3000); //espera 3 segundos
            }
            System.out.println("El proceso ha terminado");
        } catch (IOException e) {
           e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
