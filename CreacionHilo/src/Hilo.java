public class Hilo extends Thread
{
    public static void main(String[] args)
    {
        Hilo hilo1 = new Hilo();
        hilo1.setName("Hilo 1");
        hilo1.setPriority(MAX_PRIORITY);
        hilo1.start();
        Hilo hilo2 = new Hilo();
        hilo2.setName("Hilo 2");
        hilo2.setPriority(8);
        hilo2.start();
        Hilo hilo3 = new Hilo();
        hilo3.setName("Hilo 3");
        hilo3.setPriority(6);
        hilo3.start();
        Hilo hilo4 = new Hilo();
        hilo4.setPriority(4);
        hilo4.setName("Hilo 4");
        hilo4.start();
        Hilo hilo5 = new Hilo();
        hilo5.setName("Hilo 5");
        hilo5.setPriority(2);
        hilo5.start();
        Hilo hilo6 = new Hilo();
        hilo6.setName("Hilo 6");
        hilo6.setPriority(MIN_PRIORITY);
        hilo6.start();
    }
    @Override
    public void run()
    {
        super.run();
        for (int i = 0; i <10; i++) {
            //Se define el comp. del hilo.
            System.out.println("Se está ejecutando la vuelta nº " + i
                    + " del hilo " + getName());
        }

    }
}
