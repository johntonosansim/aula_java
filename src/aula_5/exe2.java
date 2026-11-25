package aula_5;

import java.util.Scanner;

public class exe2 {
    static void main(String[] args) {
        calcular();
    }

    public static void calcular(){
        Scanner sca = new Scanner(System.in);
        System.out.println("digite o numero 2 pra somar: ");
        int num = sca.nextInt();

        System.out.println("digite o numero 2: ");
        int nume = sca.nextInt();

        int soma = num + nume;

        System.out.println("seu resultado é: "+ soma);
    }
}
