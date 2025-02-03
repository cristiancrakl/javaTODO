package Calculadoras.Calculadora_java;

import javax.swing.JOptionPane;

public class operacionesAritmeticas {
        public int sumar(int num1, int num2) {

        int resultado = (num1 + num2);

        return resultado;
    }

    public int restar(int num1, int num2) {

        int resultado = (num1 - num2);

        return resultado;
    }

    public int multiplicar(int num1, int num2) {

        int resultado = (num1 * num2);

        return resultado;
    }

    public void dividir(int num1, int num2) {

        if (num2!=0) {

            int resultado = (num1 / num2);
            System.out.println("el resultado es: "+resultado);
        }else{
            JOptionPane.showMessageDialog(null, "El divisor no puede ser 0");
        }
        

    }
}
