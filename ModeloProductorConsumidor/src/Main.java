public class Main
{
    public static void main(String[] args)
    {
        Cola colaProduccion = new Cola(false);

        for (int i = 0; i < 10; i++)
        {
            Productor p = new Productor(colaProduccion);
            p.setName(String.valueOf(i));
            Consumidor c = new Consumidor(colaProduccion);
            c.setName(String.valueOf(i));
            p.start();
            c.start();
        }

    }
}
