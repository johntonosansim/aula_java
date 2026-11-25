package aula_4;
import java.util.Scanner;

public class exer_2 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);


            String[] vetor = new String[5];

            System.out.println("Digite 5 letras:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("letras " + (i + 1) + ": ");
                vetor[i] = scan.next();
            }


            System.out.print("\nDigite uma letra para procurar no vetor: ");
            String busca = scan.next();

            boolean encontrado = false;


            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i].equalsIgnoreCase(busca)) {
                    System.out.println("A letra '" + busca + "' está presente na posição " + (i+1) + " do vetor.");
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("A letra '" + busca + "' não foi encontrada no vetor.");
            }
        }
}

