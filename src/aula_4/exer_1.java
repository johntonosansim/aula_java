package aula_4;
import java.util.Scanner;
public class exer_1 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int[] veto = new int[5];
            int som = 0;

            System.out.println("Digite cinco números inteiros:");

            for (int i = 0; i < veto.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                veto[i] = scan.nextInt();
            }

            for (int i = 0; i < veto.length; i++) {
                som += veto[i];
            }

            System.out.println("\nA soma dos elementos do vetor é: " + som);
    }
}

