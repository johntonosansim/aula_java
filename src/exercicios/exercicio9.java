package exercicios;
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero francional ");
        float num1 = input.nextFloat();

        long num2 = (long) num1;

        double num3 = (double) num2;

        System.out.println("Valor do francional so pra lembra: "+num1);
        System.out.println("Valor apos casting explixito para long: "+num2);
        System.out.println("Valor apos casting implixito para doubles" +num3);

    }
}
