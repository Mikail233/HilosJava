

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor
{
    public static void main(String[] args) {
        System.out.println("Esperando datagrama...");
        byte[] buffer = new byte[1024];
        DatagramPacket datagramaRecibido = new DatagramPacket(buffer, buffer.length);
        try {
            DatagramSocket socket = new DatagramSocket(12345);
            socket.receive(datagramaRecibido); //Bloquea el prog. hasta recibir todo el datagrama...
            String mensaje = new String(datagramaRecibido.getData());
            System.out.println(mensaje);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
