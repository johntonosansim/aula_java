package aula_3_loop;
import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("digite um número inteiro positivo (ou 0): ");
            num = scanner.nextInt();
        } while (num < 0);

        long fato = 1;
        int i = num;

        if (num > 0) {
            do {
                fato *= i;
                i--;
            } while (i > 0);
        }

        System.out.println("o fatorial de " + num + " (" + num + "!) é: " + fato);
    }
}