package aula_5;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class exedesafiofinal {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

                int maximo = 20;
                int[] id = new int[20];
                String[] nome = new String[20];
                String[] email = new String[20];
                int[] idade = new int[20];

                int totalCadastrados = 0;
                int proximId = 1;
                int opcao;

                while (true) {
                    System.out.println("_______________________");
                    System.out.println("|  !Sistema Cadastro! |");
                    System.out.println("|1 - Cadastrar usuario|");
                    System.out.println("|2 - Consultar usuario|");
                    System.out.println("|3 - Atualizar usuario|");
                    System.out.println("|4 - Deletar usuario  |");
                    System.out.println("|0 - Sair             |");
                    System.out.println("|_____________________|");
                    System.out.print(" Escolha uma opcao: ");
                    opcao = parseInt(sca.nextLine());

                    if (opcao == 1) {
                        if (totalCadastrados < maximo) {
                            System.out.print(" seu nome: ");
                            nome[totalCadastrados] = sca.nextLine();

                            System.out.print(" seu email: ");
                            email[totalCadastrados] = sca.nextLine();

                            System.out.print(" sua idade: ");
                            idade[totalCadastrados] = parseInt(sca.nextLine());

                            id[totalCadastrados] = proximId;
                            System.out.println("usuario cadastrado seu Id: " + proximId);

                            proximId++;
                            totalCadastrados++;
                        } else {
                            System.out.println("limite de usuarios adiquirido");
                        }

                    } else if (opcao == 2) {
                        if (totalCadastrados == 0) {
                            System.out.println("nenhum usuario cadastrado.");
                        } else {
                            System.out.println("Id  Nome  email  idade");
                            for (int i = 0; i < totalCadastrados; i++) {
                                System.out.println(id[i] + " e " + nome[i] + " e " + email[i] + " e " + idade[i]);
                            }
                        }

                    } else if (opcao == 3) {
                        System.out.print("informe o Id do usuario: ");
                        int idBusca = parseInt(sca.nextLine());
                        boolean encontrado = false;

                        for (int i = 0; i < totalCadastrados; i++) {
                            if (id[i] == idBusca) {
                                System.out.print(" seu novo nome: ");
                                nome[i] = sca.nextLine();

                                System.out.print("seu novo email: ");
                                email[i] = sca.nextLine();

                                System.out.print("seu nova idade: ");
                                idade[i] = parseInt(sca.nextLine());

                                System.out.println("usuario atualizado!");
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Usuario nao encontrado.");
                        }

                    } else if (opcao == 4) {
                        System.out.print("Informe o ID do usuario: ");
                        int idBusca = parseInt(sca.nextLine());
                        boolean encontrado = false;

                        for (int i = 0; i < totalCadastrados; i++) {
                            if (id[i] == idBusca) {
                                for (int j = i; j < totalCadastrados - 1; j++) {
                                    id[j] = id[j + 1];
                                    nome[j] = nome[j + 1];
                                    email[j] = email[j + 1];
                                    idade[j] = idade[j + 1];
                                }
                                totalCadastrados--;
                                System.out.println("usuario deletado");
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("usuario nao encontrado.");
                            break;
                        }

                    } else if (opcao == 0) {
                        System.out.println("encerrando sistema...");
                        break;
                    } else {
                        System.out.println("opcao invalida");
                        break;
                    }
                }

    }
}
