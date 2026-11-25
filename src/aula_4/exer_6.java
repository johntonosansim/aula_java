package aula_4;
import java.util.Scanner;

public class exer_6 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
            int[][] matriz = new int[2][2];

            System.out.println("Digite os valores para a matriz 2x2:");

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sca.nextInt();
                }
            }

            System.out.println("Valores inseridos na matriz 2x2:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz[i][j] + "");
                }
                System.out.println();
            }

    }
}