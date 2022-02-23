public class Productor extends Thread
{
    Cola colaComun;

    public Productor(Cola colaComun) {
        this.colaComun = colaComun;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++)
        {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int numAProducir = Integer.parseInt(getName()) * 5 + i;
            colaComun.put(numAProducir, getName());
        }
    }
}
