package aula_3_loop;
import java.util.Scanner;
public class exer7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            nota = scan.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota: " + nota);
    }
}