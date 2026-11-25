package aula_2;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("1-Eletronico");
        System.out.println("2-Alimento");
        System.out.println("3-Vestuario");
        System.out.println("Digite um numero de um a tres: ");
        int alt = sca.nextInt();

        switch (alt) {
            case 1:
                System.out.println("vc esta na categoria eletronico.");
                break;
            case 2:
                System.out.println("vc esta na categoria alimento.");
                break;
            case 3:
                System.out.println("vc esta na categoria vestuario.");
                break;
            default:
                System.out.println("se errou digite novamente.");
                break;
        }

    }
}
