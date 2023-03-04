package br.com.calculadora;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double num[] = new Double[3];
        Scanner in = new Scanner(System.in);
        Scanner duo = new Scanner(System.in);

        String digito = "";
        int operador = 0;

        while (!digito.equals("s")) {
            System.out.println("\n                   Escolha a Operacao \n\n 1 = Divisao"
                    + "| 2 = Multiplicacao | 3 = Subtracao | 4 = Adicao");
            operador = in.nextInt();

            System.out.println("Digite o primeiro Numero");
            num[0] = in.nextDouble();

            System.out.println("Digite o segundo Numero");
            num[1] = in.nextDouble();

            if (operador == 1)
                num[2] = divisao(num[0], num[1]);
            if (operador == 2)
                num[2] = multiplicacao(num[0], num[1]);
            if (operador == 3)
                num[2] = subtracao(num[0], num[1]);
            if (operador == 4)
                num[2] = adicao(num[0], num[1]);
            System.out.println("Resultado = " + NumberFormat.getInstance().format(num[2]));
            System.out.println("\nAperte Qualquer Tecla para Continuar\n\nAperte s ou S para Sair");
            digito = duo.nextLine();
        }
        System.out.println("\n fim da execusao");
    }

    public static Double divisao(Double num_1, Double num_2) {
        return num_1 / num_2;
    }

    public static Double multiplicacao(Double num_1, Double num_2) {
        return num_1 * num_2;
    }

    public static Double subtracao(Double num_1, Double num_2) {
        return num_1 - num_2;
    }

    public static Double adicao(Double num_1, Double num_2) {
        return num_1 + num_2;
    }
}
