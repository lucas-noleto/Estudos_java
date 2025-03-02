package Desafio3;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        boolean aux = true;
        ninja [] listaNinjas = new ninja [10];
        int count = 0;
        Scanner scamOpcao = new Scanner(System.in);
        Scanner scamText = new Scanner(System.in);
        Scanner scamInt = new Scanner(System.in);

        while (aux){
            System.out.println("Ola o que você gostaria de fazer? ");
            System.out.println("1- Criar um ninja");
            System.out.println("2- Listar informações de ninjas");
            System.out.println("3- Editar informações de um ninja");
            System.out.println("4- Remover um ninja");
            System.out.println("5- Fechar o sistema");


            int opcao = scamOpcao.nextInt();
            switch (opcao){
                case 1 :
                    if (count > 10){
                        System.out.println("Desculpa vila está cheia");
                    }else {
                        System.out.println("Ninja é um uchiha ?(sim/nao)");
                        String escolha = scamText.nextLine();
                            switch (escolha){
                                case "sim":
                                    uchiha uchiha = new uchiha();
                                    System.out.println("Digite o nome do ninja: ");
                                    String info = scamText.nextLine();
                                    uchiha.nome = info;
                                    System.out.println("-------------------------------");
                                    System.out.println("Digite idade do ninja:");
                                    int infoInt = scamInt.nextInt();
                                    uchiha.idade = infoInt;
                                    System.out.println("-------------------------------");
                                    System.out.println("Digite missão atua do ninja:");
                                    info = scamText.nextLine();
                                    uchiha.missao = info;
                                    System.out.println("-------------------------------");
                                    System.out.println("Digite nivel da missão do ninja:");
                                    info = scamText.nextLine();
                                    uchiha.nivelDificuldade = info;
                                    System.out.println("-------------------------------");
                                    System.out.println("Digite status da missão do ninja:");
                                    info = scamText.nextLine();
                                    uchiha.statusMissao = info;
                                    System.out.println("-------------------------------");
                                    listaNinjas[count] = uchiha;
                                    count++;
                                    break;

                                case "nao":
                                    ninja ninja = new ninja();
                                    System.out.println("Digite o nome do ninja: ");
                                    String info2 = scamText.nextLine();
                                    ninja.nome = info2;
                                    System.out.println("-------------------------------");
                                    System.out.println("Digite idade do ninja:");
                                    int infoInt2 = scamInt.nextInt();
                                    ninja.idade = infoInt2;
                                    System.out.println("-------------------------------");
                                    System.out.println("Digite missão atua do ninja:");
                                    info2 = scamText.nextLine();
                                    ninja.missao = info2;
                                    System.out.println("-------------------------------");
                                    System.out.println("Digite nivel da missão do ninja:");
                                    info2 = scamText.nextLine();
                                    ninja.nivelDificuldade = info2;
                                    System.out.println("-------------------------------");
                                    System.out.println("Digite status da missão do ninja:");
                                    info2 = scamText.nextLine();
                                    ninja.statusMissao = info2;
                                    System.out.println("-------------------------------");
                                    listaNinjas[count]=ninja;
                                    count++;
                                    break;


                            }



                    }
                    break;

                case 2:
                    for (int i = 0; i <= count - 1; i++) {
                        System.out.println("Segue informações do ninja de numero " + i +" : ");
                        listaNinjas[i].mostrarInformacoes();

                    }
                    break;
                case 3:
                    System.out.println("Escolha qual ninja você deseja editar selecionando seu numero: ");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + " - " + listaNinjas[i].nome);
                    }

                    int infoInt3 = scamInt.nextInt();
                    System.out.println("Reescreva as informações desse ninja: ");
                    System.out.println("Digite o nome do ninja: ");
                    String info3 = scamText.nextLine();
                    listaNinjas[infoInt3].nome = info3;
                    System.out.println("-------------------------------");
                    System.out.println("Digite idade do ninja:");
                    int infoIntIdade = scamInt.nextInt();
                    listaNinjas[infoInt3].idade = infoIntIdade;
                    System.out.println("-------------------------------");
                    System.out.println("Digite missão atua do ninja:");
                    info3 = scamText.nextLine();
                    listaNinjas[infoInt3].missao = info3;
                    System.out.println("-------------------------------");
                    System.out.println("Digite nivel da missão do ninja:");
                    info3 = scamText.nextLine();
                    listaNinjas[infoInt3].nivelDificuldade = info3;
                    System.out.println("-------------------------------");
                    System.out.println("Digite status da missão do ninja:");
                    info3 = scamText.nextLine();
                    listaNinjas[infoInt3].statusMissao = info3;
                    System.out.println("-------------------------------");
                    System.out.println("Ninja editado com sucesso!");
                    listaNinjas[infoInt3].mostrarInformacoes();

                    break;
                case 4:
                    System.out.println("Escolha qual ninja você deseja deletar selecionando pelo número: ");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + " - " + listaNinjas[i].nome);
                    }

                    int infoInt4 = scamInt.nextInt();

                    if (infoInt4 < 0 || infoInt4 >= count) {
                        System.out.println("Número inválido! Tente novamente.");
                        break;
                    }


                    for (int i = infoInt4; i < count - 1; i++) {
                        listaNinjas[i] = listaNinjas[i + 1];
                    }

                    // Limṕando o ultimo elemento da lista
                    listaNinjas[count - 1] = null;

                    count--;

                    System.out.println("Ninja removido com sucesso!");
                    break;

                case 5:
                    aux=false;
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }



        }
        scamInt.close();
        scamText.close();
        scamOpcao.close();

    }
}
