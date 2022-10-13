package ejercicio8;

import java.io.*;

public class ProcesoLento3 {
    /*
    Al igual que se hizo en el ejercicio 4, crea una clase que lance el proceso ProcesoLento.Java pero usando la clase
    Runtime en vez de la clase ProcessBuilder.
    En este ejercicio vamos a tomar la salida del proceso con el método getInputStream() de la clase Process, y la
    vamos a leer para luego escribirla en un fichero llamado salidaProcesoLento2.txt.

     */
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String[] comando = {"java", "src/ejercicio2/ProcesoLento.java"};


        try {

            Process p = r.exec(comando);
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);

            BufferedReader br = new BufferedReader(isr);
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio8/ProcesoLento2.txt"));

            String line = br.readLine();

            while (line!=null){ //mientras el proceso funcione
                bw.write(line);
                bw.newLine();
                line = br.readLine();
                System.out.println("Sigue en ejecución"); //imprimo este mensaje
            }
            System.out.println("El proceso ha terminado");

            bw.close();
            br.close();
            isr.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
