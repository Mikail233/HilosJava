public class HiloB extends Thread
{
    Contador contadorComun;

    public HiloB(Contador contadorComun) {
        this.contadorComun = contadorComun;
    }

    @Override
    public void run() {
        synchronized (contadorComun)
        {
            super.run();
            for (int i = 0; i < 300; i++) {
                contadorComun.decrementar();
            }
            System.out.println("El hilo B ha dejado el contador en "
                    + contadorComun.getCuenta());
        }
    }
}
