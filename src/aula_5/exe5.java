package aula_5;
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        calcularMedia();
    }

    static void calcularMedia() {
        double[] media = new double[3];
        double rel = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite tres números real pra ver sua media:");

        for (int i = 0; i < media.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            media[i] = scan.nextDouble();
        }

        for (int i = 0; i < media.length; i++) {
            rel += media[i]/3;
        }

        System.out.println("Media: "+rel);

    }
}

