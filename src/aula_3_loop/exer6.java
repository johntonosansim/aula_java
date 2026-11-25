package aula_3_loop;

public class exer6 {
    public static void main(String[] args) {
        int conta = 0;
        int ter = 0, ter2 = 1;
        System.out.println("primeiros 10 números da Fibonaci:");
        while (conta < 10) {
            System.out.print(ter + " ");
            int proximo = ter + ter2;
            ter = ter2;
            ter2 = proximo;
            conta++;
        }
        System.out.println();
    }
}


