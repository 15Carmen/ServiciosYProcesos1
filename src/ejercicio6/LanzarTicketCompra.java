package ejercicio6;

import java.io.File;
import java.io.IOException;

public class LanzarTicketCompra {
    public static void main(String[] args) {
        String[] comando = {"java", "src/ejercicio6/TicketCompra.java"};
        ProcessBuilder pb = new ProcessBuilder(comando);
         pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
         pb.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("C:\\Users\\cmartin\\IntelliJ\\SistemasYProcesos1\\src\\ejercicio6\\compra.txt")));
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
