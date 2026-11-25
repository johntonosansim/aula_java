package aula_5;
import java.util.Scanner;

public class exe4 {
    static void main(String[] args) {
    converterCelsiusParaFahrenheit();
    }

    static void converterCelsiusParaFahrenheit(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Digite o temperatura em Celsius que vc desejar: ");
        float cel = sca.nextFloat();

        double fahrenheit = (cel * 1.8) + 32;
        System.out.println(" seu Fahrenheit é: " + fahrenheit);
    }
}
