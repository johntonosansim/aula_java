package aula_5;

import java.util.Scanner;

public class exe3 {
    static void main(String[] args) {
        dobra();
    }

    public static void dobra() {
        Scanner sca = new Scanner(System.in);
        System.out.println("digite o numero que voce deseja dobrar: ");
        int num = sca.nextInt();

        int rel = num*2;

        System.out.println("seu relsutando é: " +rel);
    }
}
