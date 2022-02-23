public class HiloConRunnable implements Runnable
{
    public static void main(String[] args) {
        HiloConRunnable runnable = new HiloConRunnable();
        Thread hilo1 = new Thread(runnable);
        hilo1.setName("Hilo 1");
        hilo1.setPriority(Thread.MAX_PRIORITY);
        hilo1.start();
        Thread hilo2 = new Thread(runnable);
        hilo2.setName("Hilo 2");
        hilo2.setPriority(8);
        hilo2.start();
        Thread hilo3 = new Thread(runnable);
        hilo3.setName("Hilo 3");
        hilo3.setPriority(6);
        hilo3.start();
        Thread hilo4 = new Thread(runnable);
        hilo4.setName("Hilo 4");
        hilo4.setPriority(4);
        hilo4.start();
        Thread hilo5 = new Thread(runnable);
        hilo5.setName("Hilo 5");
        hilo5.setPriority(2);
        hilo5.start();
        Thread hilo6 = new Thread(runnable);
        hilo6.setName("Hilo 6");
        hilo6.setPriority(Thread.MIN_PRIORITY);
        hilo6.start();
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Se está ejecutando la vuelta nº " + i
                    + " del hilo " + Thread.currentThread().getName());
        }
    }
}
