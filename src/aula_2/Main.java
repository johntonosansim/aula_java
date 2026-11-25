package aula_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome");
        String nome =scanner.next();
        System.out.println("Seu nome é: "+nome
        );

        System.out.println("Digite sua idade ?");
        scanner.nextLine();
        int idade = scanner.nextInt();

        System.out.println("sua idade é "+ idade);

        scanner.close();;
    }
}


