package exercicios;
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um Lado pro retangulo: ");
        float lad1 = input.nextFloat();
        System.out.println("Digite um outro Lado pro retangulo: ");
        float lad2 = input.nextFloat();

        float relsu = lad1 * lad2;

        System.out.println("o seu resultado da area é: " + relsu);
    }
}
