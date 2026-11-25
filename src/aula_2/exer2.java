package aula_2;

import java.util.Scanner;

public class exer2 {
    static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Digitei o seu valor da sua comprar: ");
        float com1 = sca.nextFloat();
        if (com1>100){
           double rel = com1 * 0.10;
           System.out.println("seu conta é "+ rel);
        }
        else{
            System.out.println("voce não ganhou desconto, e vai pagar esse preço."+com1);
        }
    }
}
