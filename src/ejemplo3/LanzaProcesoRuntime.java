package ejemplo3;

import java.io.*;

public class LanzaProcesoRuntime {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String[] comando = {"java", "src/ejercicio7/Clase1.java"};
        try {
            Process p = r.exec(comando);
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejemplo3/salida.txt"));

            String line = br.readLine();
            while (line != null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
