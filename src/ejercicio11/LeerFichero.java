package ejercicio11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\pruebas\\carpeta1\\fichero2.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null){

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
