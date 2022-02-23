public class Cola
{
    int numeroActual;
    boolean disponible;

    public Cola(boolean disponible) {
        this.disponible = disponible;
    }
    //Llamado por el productor para producir números nuevos
    synchronized void put(int nuevoNumero, String idProductor)
    {
        while (disponible)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numeroActual = nuevoNumero;
        System.out.println("El productor " + idProductor + " produce el " + numeroActual);
        disponible = true;
        notifyAll();
    }
    //Llamado por el consumidor para consumir números en cola.
    synchronized int get(String idConsumidor)
    {
        while (!disponible)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponible = false;
        System.out.println("El consumidor " + idConsumidor + " consume el " + numeroActual);
        notifyAll();
        return numeroActual;
    }

}
