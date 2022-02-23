import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente
{
    public static void main(String[] args)
    {
        String host = "localhost";
        int puerto = 80;
        InetSocketAddress address = new InetSocketAddress(host, puerto);
        Socket socket = new Socket();
        try {
            System.out.println("Conectando...");
            socket.connect(address);
            OutputStream oS = socket.getOutputStream();
            oS.write("¡Hola servidor!".getBytes());
            oS.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
