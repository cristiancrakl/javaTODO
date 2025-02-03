package ArchivosBinariosDAT;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class EscribirArchivosDAT {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(25);

        File archivo = new File("persona.dat");

        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persona);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

}