package Calculadoras.Calculadora_java;

import java.util.Scanner;

public class Main {
    funcionesUtilizar funciones = new funcionesUtilizar();
    Scanner scanner = new Scanner(System.in);

    public void calcularMenu() {

        boolean continuar = true;

        while (continuar == true) {
            System.out.println("");
            System.out.println(" Ingrese la operacion que desea realizar");
            System.out.print(" 1.Suma");
            System.out.print(" 2.Resta");
            System.out.print(" 3.Multiplicacion");
            System.out.print(" 4.Division");
            System.out.println("");

            int opcion = scanner.nextInt();
            funciones.scanearOPCION(opcion);

            System.out.println("");
            System.out.println("Desea continuar ");
            System.out.print(" 1.si");
            System.out.print(" 2.no");
            System.out.println("");
            int continuarOPCION = scanner.nextInt();

            if (continuarOPCION == 1) {
                continuar = true;
            } else {
                break;
            }

        }

    }
}