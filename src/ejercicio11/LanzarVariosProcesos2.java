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
        Process p3 = r.exec(comando2);
        FileReader fr = new FileReader("fichero2.txt");
        BufferedReader br = new BufferedReader(fr);

        OutputStream os = p3.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while (line!=null){ //mientras el proceso funcione
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }

        bw.close();
        p3.waitFor();
        InputStream is = p3.getInputStream();
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
        throw new RuntimeException(e);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}
}
