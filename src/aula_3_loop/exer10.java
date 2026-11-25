package aula_3_loop;
import java.util.ArrayList;
import java.util.Scanner;

    public class  exer10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> par = new ArrayList<>();
            ArrayList<Integer> impar = new ArrayList<>();
            System.out.println("Digite números de 0 a 100");
            System.out.println("Digite um número maior que 100 para parar bruscamente");
            System.out.println("Digite um número negativo para terminar.");
            while (true) {
                System.out.print("Digite um número: ");
                int num = scanner.nextInt();
                if (num > 100) {
                    System.out.println("\nNúmero muito grande, realizada");
                    break;
                }
                if (num < 0) {
                    break;
                }
                if (num % 2 == 0) {
                    par.add(num);
                    continue;
                }
                impar.add(num);
            }
            System.out.println("Números par digitados: " + par);
            System.out.println("Números ímpar digitados: " + impar);

        }
    }