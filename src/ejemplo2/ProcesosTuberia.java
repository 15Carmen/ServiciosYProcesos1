package ejemplo2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcesosTuberia {
    public static void main(String[] args) {
        ProcessBuilder pb1=new ProcessBuilder("java", "src/ejemplo2/Proceso1.java");
        ProcessBuilder pb2=new ProcessBuilder("java", "src/ejemplo2/Proceso2.java");

        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        lpb.add(pb1);
        lpb.add(pb2);
        pb2.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        try{
            List<Process> lProcess = ProcessBuilder.startPipeline(lpb);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
