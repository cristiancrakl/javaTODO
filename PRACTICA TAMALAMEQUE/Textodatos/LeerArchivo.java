package Textodatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class LeerArchivo {
    
    public static void main(String[] args) {
        File archivo = new File("archivo.txt");
        try {
            
            FileReader leerArchivo = new FileReader(archivo);
            BufferedReader bf =new BufferedReader(leerArchivo);
            String linea;
            linea= bf.readLine();
            

            while (linea!=null) {
                System.out.println(linea);
                linea=bf.readLine();
            }

            bf.close();
            leerArchivo.close();

        } catch (Exception e) {
            
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
