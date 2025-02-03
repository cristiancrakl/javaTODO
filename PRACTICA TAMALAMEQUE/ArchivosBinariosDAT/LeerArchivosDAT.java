package ArchivosBinariosDAT;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LeerArchivosDAT {

    public static void main(String[] args) {
    
        File archivo=new File("persona.dat");

        try {
            FileInputStream fis=new FileInputStream(archivo);
            ObjectInputStream ois;

            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                Persona persona = (Persona) ois.readObject();
                System.out.println(persona.toString());
                
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("error"+e);
        }


    }

    
}
