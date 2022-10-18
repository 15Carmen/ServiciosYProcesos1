package ejercicio9;

import java.io.*;

public class PreguntaNombre2 {
    /*
    Realiza de nuevo el ejercicio 5, pero en vez de utilizar ProcessBuilder para lanzar la clase PreguntaNombre.java
    utiliza la clase Runtime. Utiliza el método getOutputStream() de la clase Process para que tome los datos de un
    fichero de texto, por ejemplo, entradaNombre.txt. Para poder ver la salida en la consola habrá que usar el método
    getInputStream() e imprimirlo por pantalla.
     */
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String[] comando = {"java", "src/ejercicio5/PreguntaNombre.java"};

        try {
            Process p = r.exec(comando);
            FileReader fr = new FileReader("src/ejercicio5/entrada.txt");
            BufferedReader br = new BufferedReader(fr);

            OutputStream os = p.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String line = br.readLine();

            while (line!=null){ //mientras el proceso funcione
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }

            bw.close();
            p.waitFor();
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br2 = new BufferedReader(isr);

            String linea = br2.readLine();
            while (linea != null){
                System.out.println(linea);
                linea= br2.readLine();
            }

            br.close();
            os.close();
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}



