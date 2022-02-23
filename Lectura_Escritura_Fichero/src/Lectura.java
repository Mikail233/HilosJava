import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura
{
    public static void main(String[] args)
    {
        File file = new File("entrada.txt");
        try
        {
            FileReader reader = new FileReader(file);
            int c = 0;
            while( (c = reader.read()) != -1)
            {
                System.out.print((char) c);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
