import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
    public static void main(String[] args) {
        try {
            System.out.println("Servidor a la escucha...");
            ServerSocket server = new ServerSocket(80);
            Socket cliente = server.accept(); //Método que queda a la escucha...
            System.out.println("¡Cliente conectado!");
            ObjectInputStream iS = new ObjectInputStream(cliente.getInputStream());
            Persona datosPersona = (Persona) iS.readObject();
            System.out.println("Bienvenido " + datosPersona.nombre + "." +
                    " Tu edad es de " + datosPersona.edad + " y tu contraseña es: " +
                    datosPersona.contrasenha);
            cliente.close();
            iS.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
