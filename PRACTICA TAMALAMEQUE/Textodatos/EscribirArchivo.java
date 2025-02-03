package Textodatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivo {

    public static void main(String[] args) {

        System.out.println("Programa para escribir en archivos");

        String cad = "Contenido de mi archivo2";
        File archivo = new File("archivo.txt");

        try {
            FileWriter archivoFisico = new FileWriter(archivo, true);
            PrintWriter pw = new PrintWriter(archivoFisico);
            pw.println(cad);
            pw.println("cuarta linea uwu"); // no sale a a la consola, esto se escribe en el archivo
            pw.println("");
            pw.close();

        } catch (IOException ex) {

            System.out.println("no es posible acceder a la referencia");
        }

    }

}