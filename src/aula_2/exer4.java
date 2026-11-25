package aula_2;

import java.util.Scanner;

public class exer4 {
    static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("digite o seu valor de venda: ");
        float venda = sca.nextFloat();

        if(venda>1000){
           double comi = venda*0.05;
            System.out.println("seu comissão: "+comi);
        }
        else if(venda<=5000){
            double comi = venda*0.10;
            System.out.println("seu comissão: "+comi);
        }
        else{
            double comi = venda*0.15;
            System.out.println("seu comissao: "+comi);
        }
    }
}
