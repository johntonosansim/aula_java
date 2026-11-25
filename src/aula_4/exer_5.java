package aula_4;

import java.util.Scanner;

public class exer_5 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String[] nomes = new String[3];

        System.out.println("Digite 3 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = sca.nextLine();
        }

        System.out.print("\nDigite o nome que deseja verificar: ");
        String nomeBusca = sca.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome '" + nomeBusca + "' está no vetor.");
        } else {
            System.out.println("Sistema não o encontrou");
        }
    }
}
