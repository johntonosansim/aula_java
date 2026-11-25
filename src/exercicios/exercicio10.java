package exercicios;
import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero pequeno");
        short numerozi =  input.nextShort();

        int numer = (int)(numerozi);
        byte nu = (byte)numer;

        System.out.println("Valor do pequeno so pra lembra: "+numerozi);
        System.out.println("Valor apos casting explixito para int: "+numer);
        System.out.println("Valor apos casting implixito para nu: " +nu);
    }
}
