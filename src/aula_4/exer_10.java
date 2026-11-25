package aula_4;

import java.util.Scanner;

public class exer_10 {
    public static void main(String[] args) {
            Scanner sca = new Scanner(System.in);

            int[][] matriz = new int[3][3];

            System.out.println("Digite os valores para a matriz 3x3:");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sca.nextInt();
                }
            }

            int maior = matriz[0][0];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                }
            }

            System.out.println("\nO maior valor armazenado na matriz é: " + maior);

    }
}