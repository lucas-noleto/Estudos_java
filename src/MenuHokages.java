import java.util.Scanner;

public class MenuHokages {
    public static void main(String[] args) {
        boolean condicao = true;
        String [] ninjas = new String[4];
        Scanner scamEscolha = new Scanner(System.in);
        Scanner scamNome = new Scanner(System.in);
        int count = 0;
        while (condicao){


            System.out.println("-----------------------Menu Ninja--------------------");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 -Cadastrar um novo ninja. ");
            System.out.println("2 -Listar ninjas cadastrados. ");
            System.out.println("3 -Deseja sair do menu");
            int escolha = scamEscolha.nextInt();

            switch (escolha){
                case 1:
                    if (count>3){
                        System.out.println("Vila esta lotada, desculpe!");
                    }else {

                        System.out.println("Digite o nome do ninja:");
                        String nome = scamNome.nextLine();
                        ninjas[count] = nome;

                        count++;
                    }



                    break;
                case 2:
                    if (count != 0 ) {
                        System.out.println("Aqui está os ninjas cadastrados até agora: ");
                        for (int i = 0; i < count ; i++) {
                            System.out.println("Posição: " + i + "Nome do ninja: "+ ninjas[i]);

                        }
                    }else {
                        System.out.println("Ainda nao temos um ninja cadastrado, desculpe.");
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar nosso sistema :)");
                    condicao = false;
                    break;

                default:
                    System.out.println("Opcao invalida, digite novamente.");
            }

        }
        scamNome.close();
        scamEscolha.close();
    }
}
