package exercicios;
import java.util.Scanner;

public class exercicio5 {
    static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 =sca.nextInt();
        System.out.println("digite mais um numero");
        int num2 = sca.nextInt();
        System.out.println("digite denovo um numero");
        int num3  = sca.nextInt();

        int rels = num1+num2+num3;
        System.out.println("seu resultado e: "+ rels);

    }
}
