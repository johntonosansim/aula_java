package aula_4;

import java.util.Scanner;

public class exer_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[4][4];

        System.out.println("Digite os valores para a matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nSoma do valore de cada linha:");
        for (int i = 0; i < 4; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }
    }
}