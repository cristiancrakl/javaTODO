package ArchivosBinariosDAT;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private int edad;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

}
