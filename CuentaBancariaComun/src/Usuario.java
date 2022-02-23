public class Usuario extends Thread
{
    String nombre;
    CuentaBancariaComun cuentaComun;

    public Usuario(String nombre, CuentaBancariaComun cuentaComun) {
        this.nombre = nombre;
        this.cuentaComun = cuentaComun;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 30; i++) {
            cuentaComun.retirarDinero(nombre, 10);
        }
    }
}
