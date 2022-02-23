import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
    public static void main(String[] args)
    {
        try {
            ServerSocket server = new ServerSocket(80);
            System.out.println("Esperando...");
            Socket cliente = server.accept();
            System.out.println("¡Cliente conectado!");
            InputStream iS = cliente.getInputStream();
            InputStreamReader isR = new InputStreamReader(iS);
            BufferedReader bf = new BufferedReader(isR);
            String linea = "";
            while ( ( linea = bf.readLine() )!= null)
            {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
