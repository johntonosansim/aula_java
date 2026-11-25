package aula_3_loop;
import java.util.Scanner;
public class exer8 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int par = 0;
            int impar = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("digite o " + i + "º número inteiro: ");
                int num = scan.nextInt();

                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }

            System.out.println("Quantidade de pares: " + par);
            System.out.println("Quantidade de ímpares: " + impar);
        }
}

