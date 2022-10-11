package ejercicio8;

import java.io.*;

public class ProcesoLento3 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String[] comando = {"java", "src/ejercicio2/ProcesoLento.java"};


        try {

            Process p = r.exec(comando);
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio8/ProcesoLento2.txt"));
            while (p.isAlive()){ //mientras el proceso funcione
                System.out.println("Sigue en ejcución"); //imprimo este mensaje
                Thread.sleep(3000); //espera 3 segundos
            }
            System.out.println("El proceso ha terminado");

            bw.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
