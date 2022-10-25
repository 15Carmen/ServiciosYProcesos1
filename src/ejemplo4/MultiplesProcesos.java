package ejemplo4;

import java.io.File;
import java.io.IOException;

public class MultiplesProcesos {

    public static void main(String[] args) {
        String clases[]={"A", "B", "C"};
        crearFicheros();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < clases.length; j++) {
                ProcessBuilder pb = new ProcessBuilder("java", "./src/ejercicio7/Clase3.java", clases[j]);
                //pb.directory(new File("C:\\Users\\cmartin\\IntelliJ\\SistemasYProcesos1\\src\\ejercicio7"));
                pb.redirectInput(new File("C:\\Servicios\\ficheros\\ip"+i+".txt"));
                pb.redirectError(ProcessBuilder.Redirect.INHERIT);
                pb.redirectOutput(new File("C:\\Servicios\\ficheros\\"+ clases[j]+".txt"));

                try {
                    pb.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void crearFicheros(){
        for (int i = 0; i < 10; i++) {
            ProcessBuilder pb = new ProcessBuilder("java", "./src/ejercicio7/Clase1.java");
            //pb.directory(new File("C:\\Users\\cmartin\\IntelliJ\\SistemasYProcesos1\\src\\ejercicio7"));
            pb.redirectOutput(new File("C:\\Servicios\\ficheros\\ip"+i+".txt"));
            pb.redirectError(ProcessBuilder.Redirect.INHERIT);

            try {
                Process p = pb.start();
                //p.waitFor();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
