import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LanzaPrograma
{
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("java",
                "ProgramaHello", args[0]);
        File ruta = new File(".\\out\\production\\LanzarJavaCmoProceso");
        pb.directory(ruta);
        try {
            Process p = pb.start();
            InputStream iS = p.getInputStream();
            InputStreamReader iSReader = new InputStreamReader(iS);
            int caracterLeido = 0;
            String resultadoCompleto = "";
            while (caracterLeido != -1)
            {
                resultadoCompleto += (char) caracterLeido;
                caracterLeido = iSReader.read();
            }
            iS.close();
            iSReader.close();
            System.out.println(resultadoCompleto);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}