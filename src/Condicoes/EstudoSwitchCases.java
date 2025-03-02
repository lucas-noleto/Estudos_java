package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        *
        * Estudo Switch Cases
        *
        * Servem para gerar algo especifico
        *
        *
        *obj -> usuario vai escolher o ninja usando switch
        *
        *
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki. ");
        System.out.println("2 - Sakura Haruno");
        System.out.println("3 - Sasuke Uchiha ");

        int escolhaUsuario = scanner.nextInt();

        System.out.println("Voce digitou " + escolhaUsuario);

        switch (escolhaUsuario){
            case 1:
                System.out.println("O usuario escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu Sakura Haruno");
                break;
            case 3:
                System.out.println("O usuario escolheu Sasuke Uchiha");
                break;
            default:
                System.out.println("Opcao invalida, digite novamente.");


        }

        scanner.close();




    }
}
