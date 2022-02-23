public class Contador
{
    int cuenta;

    public Contador(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }

    void incrementar()
    {
        cuenta++;
    }
    void decrementar()
    {
        cuenta--;
    }
}
