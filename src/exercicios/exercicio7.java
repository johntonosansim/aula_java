package exercicios;
import java.util.Scanner;
public class exercicio7 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um true ou false: ");
        boolean num1 = input.nextBoolean();
        System.out.println("Digite outro true ou false: ");
        boolean num2 = input.nextBoolean();
        System.out.println("Digite denovo outro true ou false: ");
        boolean num3 = input.nextBoolean();

        System.out.println("o boo1 com boo2 é: " + (num1 && num2));
        System.out.println("o boo1 com boo3 é: " + (num1 && num3));
        System.out.println("o boo2 com boo2 é: " + (num2 && num3));

        System.out.println("o boo1 nao e igual a boo2: " + (num1 || num2));
        System.out.println("o boo1 nao e igual a boo3: " + (num1 || num3));
        System.out.println("o boo2 nao e igual a boo3: " + (num2 || num3));
    }
}
