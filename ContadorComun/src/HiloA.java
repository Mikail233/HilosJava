public class HiloA extends Thread
{
    Contador contadorComun;

    public HiloA(Contador contadorComun) {
        this.contadorComun = contadorComun;
    }

    @Override
    public void run() {
        synchronized (contadorComun)
        {
            super.run();
            for (int i = 0; i < 300; i++)
            {
                contadorComun.incrementar();
            }
            System.out.println("El hilo A ha dejado el contador en "
                    + contadorComun.getCuenta());
        }

    }
}
