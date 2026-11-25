package aula_3_loop;
import java.util.Scanner;

public class exer4 {
        public static boolean Primo(int num) {
            if (num <= 1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número inteiro positivo: ");
            int num = scanner.nextInt();
            if (Primo(num)) {
                System.out.println(num +" É um número primo");
            }
            else {
                System.out.println(num+" Não é um número primo");
            }
        }
}
