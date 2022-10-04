package ejercicio5;

import java.io.File;
import java.io.IOException;

public class LanzaPreguntaNombre {
    public static void main(String[] args) {
        String[] comando = {"java", "src/ejercicio5/PreguntaNombre.java"};
        ProcessBuilder pb = new ProcessBuilder(comando);

        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        //para que no lea su nombre de teclado, lo redirijo al fichero
        pb.redirectInput(new File("C:\\Users\\cmartin\\IntelliJ\\SistemasYProcesos1\\src\\ejercicio5\\entrada.txt"));
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
