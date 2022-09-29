package crearproceso;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class crearProceso {
    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("java", "src/crearproceso/HolaMundo.java");
        //pb.directory(new File("C:\\Users\\cmartin\\IntelliJ\\SistemasYProcesos1\\src"));
        pb.inheritIO(); //para ver lo que está haciendo el proceso que he lanzado, hacer que el proceso encuentre la entradan/salida estandar

        Map<String,String> mapa=pb.environment(); //El enviroment devuelve todo el proceso de ejecución del proceso
        mapa.keySet();//me devuelve un conjunto con todas las claves del mapa
        Set<String> claves = mapa.keySet();

        for (String clave: claves) {
            String valor = mapa.get(clave);
            //System.out.println("[ "+clave+ ", "+valor+" ]");
            System.out.println(clave + " = "+valor);
        }


        try{
            Process p = pb.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
