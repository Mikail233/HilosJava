public class CuentaBancariaComun
{
    int saldo;

    public CuentaBancariaComun(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    synchronized void retirarDinero(String nombre, int cantidad)
    {
        if(cantidad > getSaldo())
        {
            System.out.println(nombre + " intenta retirar dinero " +
                    " pero sólo queda " + getSaldo());
        }
        else
        {
            //Se retirará el dinero.
            try {
                Thread.sleep(500);
                setSaldo(getSaldo() - cantidad);
                System.out.println(nombre + " retira " + cantidad + " y en la cuenta" +
                        " quedan " + getSaldo());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
