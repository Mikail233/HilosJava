public class Main
{
    public static void main(String[] args) {
        //1. Generar el contador
        Contador contadorComun = new Contador(0);
        //2. Generar el hilo A y lanzarlo
        HiloA hiloA = new HiloA(contadorComun);
        //3. Generar el hilo B y lanzarlo
        HiloB hiloB = new HiloB(contadorComun);
        hiloA.start();
        hiloB.start();
    }
}
