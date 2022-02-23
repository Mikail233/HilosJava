
import java.io.*;
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

            //------ESCRITURA-------//
            System.out.println("Por favor, escriba su nombre");
            BufferedReader bfTeclado = new BufferedReader(new InputStreamReader(System.in));
            String nombreUsuario = bfTeclado.readLine();
            OutputStream oS = socket.getOutputStream();
            oS.write((nombreUsuario + "\n").getBytes());

            //-------LECTURA-------//
            InputStream iS = socket.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(iS));
            String linea = "";
            System.out.println(bf.readLine());

            iS.close();
            bf.close();
            oS.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
