import java.io.IOException;
import java.net.*;

public class Cliente
{
    public static void main(String[] args)
    {
        //Datagrama =Mensaje, longuitud del msj, ip destino, puerto destino.
        byte[] mensaje = new byte[1024];
        mensaje = "¡Hola, servidor!".getBytes();
        int puertoDestino = 12345; //Puerto del servidor.
        try {
            InetAddress direccion = InetAddress.getLocalHost();
            DatagramPacket datagrama = new DatagramPacket(mensaje, mensaje.length,
                    direccion, puertoDestino);
            DatagramSocket socket = new DatagramSocket(34567);
            socket.send(datagrama); //Bloquea el programa hasta que el datagrama sea enviado.
            System.out.println("El datagrama ha sido enviado");
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
