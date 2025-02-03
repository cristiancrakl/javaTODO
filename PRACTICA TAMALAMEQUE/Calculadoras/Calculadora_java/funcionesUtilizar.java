package Calculadoras.Calculadora_java;

import java.util.Scanner;

public class funcionesUtilizar {
    Scanner scanner = new Scanner(System.in);
    operacionesAritmeticas operacion = new operacionesAritmeticas();

    public void scanearOPCION(int opcion) {

        int num1;
        int num2;

        switch (opcion) {
            case 1:

                System.out.println("ingrese los numeros a ser sumados");

                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                System.out.println("la suma es: " + operacion.sumar(num1, num2));

                break;

            case 2:
                System.out.println("ingrese los numeros a ser restados");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                System.out.println("la resta es: " + operacion.restar(num1, num2));

                break;
            case 3:
                System.out.println("ingrese los numeros a ser multiplicados");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                System.out.println("la multiplicacion es: " + operacion.multiplicar(num1, num2));

                break;
            case 4:

                System.out.println("ingrese los numeros a ser divididos");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();

                operacion.dividir(num1, num2);

                break;

            default:
                System.out.println("Opción no válida");

                break;
        }

    }

}
