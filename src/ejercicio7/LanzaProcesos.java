package ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LanzaProcesos {
    public static void main(String[] args) {
        ProcessBuilder pb1=new ProcessBuilder("java", "src/ejercicio7/Clase1.java");
        ProcessBuilder pb2=new ProcessBuilder("java", "src/ejercicio7/Clase2.java");
        ProcessBuilder pb3=new ProcessBuilder("java", "src/ejercicio7/Clase3.java");

        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        lpb.add(pb1);
        lpb.add(pb2);
        lpb.add(pb3);

        pb3.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb3.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("src/ejercicio7/direcciones.txt")));

        try{
            pb1.start();
            List<Process> lProcess = ProcessBuilder.startPipeline(lpb);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
