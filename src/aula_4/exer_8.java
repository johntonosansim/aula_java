package aula_4;

import java.util.Scanner;

public class exer_8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[2][2];

        System.out.println("Digite os valores para a matriz 2x2:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nSoma do valore de cada linha:");
        for (int i = 0; i < 2; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 2; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }
    }
}