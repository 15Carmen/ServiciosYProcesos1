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
            OutputStream os = p.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



