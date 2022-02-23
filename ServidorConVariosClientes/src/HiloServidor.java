import java.io.*;
import java.net.Socket;

public class HiloServidor extends Thread
{
    OutputStream osCliente;
    BufferedReader bfCliente;
    InputStream iS;
    Socket nuevoCliente;
    //Construir el outputStream y el InputStream de ese nuevo cliente.
    public HiloServidor(Socket nuevoCliente)
    {
        try {
            this.nuevoCliente = nuevoCliente;
            iS = nuevoCliente.getInputStream();
            bfCliente = new BufferedReader(new InputStreamReader(iS));
            osCliente = nuevoCliente.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Los diferentes clientes van a ser leídos y escritos por el servidor.
    @Override
    public void run()
    {
        super.run();
        try {
            //------LECTURA------//
            String usuario = null;
            usuario = bfCliente.readLine();
            //------ESCRITURA-----//
            osCliente.write(("¡Bienvenido " + usuario + "!").getBytes());

            osCliente.close();
            bfCliente.close();
            iS.close();
            nuevoCliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
