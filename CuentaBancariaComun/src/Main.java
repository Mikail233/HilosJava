public class Main
{
    public static void main(String[] args) {
        //1. Crear cuenta bancaria en común
        CuentaBancariaComun cuentaComun = new CuentaBancariaComun(300);
        //2. Crear Ana y Juan y lanzarlos.
        Usuario ana = new Usuario("Ana", cuentaComun);
        Usuario juan = new Usuario("Juan", cuentaComun);
        ana.start();
        juan.start();
    }
}
