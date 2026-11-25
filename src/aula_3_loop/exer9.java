package aula_3_loop;
import java.util.Scanner;
import java.util.Random;
public class exer9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random aleato = new Random();
        int numSecret = aleato.nextInt(100) + 1;
        int palpi;
        int tenta = 0;
        System.out.println("adivinhar o número de 1 e 100!");
        do {
            System.out.print("digite seu palpite: ");
            palpi = scan.nextInt();
            tenta++;
            if (palpi < numSecret) {
                System.out.println("O número é MAIOR.");
            } else if (palpi > numSecret) {
                System.out.println("O número  é MENOR.");
            } else {
                System.out.println("Você acertou!");
            }
        } while (palpi != numSecret);
        System.out.println("tentativas: " + tenta);
    }
}
