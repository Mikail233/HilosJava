import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente
{
    public static void main(String[] args) {
        Socket socket = new Socket();
        String host = "localhost";
        int puerto = 80;
        InetSocketAddress address = new InetSocketAddress(host, puerto);
        try {
            socket.connect(address);
            System.out.println("¡Estamos conectados!");
            Persona usuario = new Persona("Juan", 22, 12345);
            ObjectOutputStream oS =  new ObjectOutputStream(socket.getOutputStream()); //Escribo información al servidor.
            oS.writeObject(usuario);
            socket.close();
            oS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
