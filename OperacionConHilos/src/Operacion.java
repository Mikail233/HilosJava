public class Operacion implements Runnable
{
    static final int NUM_HILOS = 1000;
    public static void main(String[] args)
    {
        Operacion runnable = new Operacion();
        for (int i = 0; i < NUM_HILOS; i++) {
            Thread hilo = new Thread(runnable);
            hilo.start();
        }
    }

    @Override
    public void run()
    {
        int numOperaciones = 100;
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < numOperaciones; i++)
        {
            for (double j = 0; j < 4999.97; j+= 0.04)
            {
                System.out.println("El hilo " + Thread.currentThread().getName()
                + " calcula la raíz cuadrada de " + j + " y su resultado es: " + Math.sqrt(j));
            }
        }
    }
}
