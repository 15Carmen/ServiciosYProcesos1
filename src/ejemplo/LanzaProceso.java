package ejemplo;

import java.io.File;
import java.util.Arrays;
import java.io.IOException;
import java.util.Map;

public class LanzaProceso {

    public static void main(String[] args) {

        // Comprobamos que se ha introducido al menos un comando
        if (args.length <= 0) {
            System.out.println("Debe indicarse comando a ejecutar.");
            // Terminamos la ejecución del programa con valor 1
            System.exit(1);
        }

        // Le pasamos los argumentos al ProcessBuilder
        ProcessBuilder pb = new ProcessBuilder(args);
        File directorio = new File("C:\\Users\\cmartin\\IntelliJ\\SistemasYProcesos1\\src\\lanzaproceso");
        pb.directory(directorio); //metodo del ProcessBuilder

        /**
         *  Con esta llamada hacemos que el proceso herede la entrada
         *  y salida estándares del proceso padre
        */
        pb.inheritIO();

        Map<String,String> entorno=pb.environment();

        try {
            // Arrancamos el proceso
            Process p = pb.start();

            /* Se espera a que termine la ejecución del proceso hijo y se obtiene el código de retorno.
             * Si durante la espera se interrumple la ejecución del programa, se lanzará una excepción
             * de tipo InterruptedException. Este programa la capturará y la informará.
             */
            int codRet = p.waitFor();
            System.out.println("La ejecucion de " + Arrays.toString(args)
                    + " devuelve " + codRet
                    + " " + (codRet == 0 ? "(ejecucion correcta)" : "(ERROR)")
            );
        } catch (IOException e) {
            System.err.println("Error durante ejecucion del proceso");
            System.err.println("Informacion detallada");
            System.err.println("---------------------");
            e.printStackTrace();
            System.err.println("---------------------");
            // Indicamos que la ejecución termina con error 2
            System.exit(2);
        } catch (InterruptedException e) {
            System.err.println("Proceso interrumpido");
            // Indicamos que la ejecución termina con error 2
            System.exit(3);
        }

    }
}
