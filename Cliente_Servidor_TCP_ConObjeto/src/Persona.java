import java.io.Serializable;

public class Persona implements Serializable
{
    String nombre;
    int edad;
    int contrasenha;

    public Persona(String nombre, int edad, int contrasenha) {
        this.nombre = nombre;
        this.edad = edad;
        this.contrasenha = contrasenha;
    }
}
