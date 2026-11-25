package aula_2;

import java.util.Scanner;

public class exer5 {
    static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("digite o total horas de trabalho do més: ");
        double tra = sca.nextDouble();

        System.out.println("digite o valor do ganho por horas: ");
        double val = sca.nextDouble();

        if(tra >40) {
            double ext = tra - 40;
            double extval = val * 1.5;
            double total = ext + extval;

            System.out.println("hora extra foi: "+ ext);
            System.out.println("valor da hora extra foi: "+ total);
        }
        else {
            System.out.println("não houver horas extras.");
        }
    }
}
