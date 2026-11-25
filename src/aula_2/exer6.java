package aula_2;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite nota do aluno de 0 a 10: ");
        int not = input.nextInt();
        if (not < 0 || not > 10) {
            System.out.println("ERRO");
        } else if (not>= 7.0) {
            System.out.println("Situação: Passou!!");
        }
        else if (not>= 5.0) {
            System.out.println("que pena esta em recuperação");
        }
        else {
            System.out.println("reprovando.");
        }
    }
}
