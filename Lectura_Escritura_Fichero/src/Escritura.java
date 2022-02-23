import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura
{
    public static void main(String[] args) {
        File file = new File("entrada.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("¡Hola a todos!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
