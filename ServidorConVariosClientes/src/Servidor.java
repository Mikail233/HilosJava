import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(80);
            while (true)
            {
                System.out.println("Escuchando...");
                Socket cliente = server.accept();
                System.out.println("Cliente conectado");
                HiloServidor hilo = new HiloServidor(cliente);
                hilo.start();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
