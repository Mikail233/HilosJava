public class EjemploHilos implements Runnable
{

    public static void main(String[] args) {
        EjemploHilos runnable = new EjemploHilos();
        Thread hilo1 = new Thread(runnable);
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread hilo2 = new Thread(runnable);
        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread hilo3 = new Thread(runnable);
        hilo3.start();
        try {
            hilo3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Todos los hilos han terminado");
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("El hilo " + Thread.currentThread().getName() +
                     " va por " + i);
        }
    }
}
