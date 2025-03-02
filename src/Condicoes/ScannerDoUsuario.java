package Condicoes;


import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
        * Scanner eh uma forma do usuario inserir valores
        * Objetivo: O usuario vai criar um ninja
        *
        * */
        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Escreva aqui o nome do ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("Ninja eh: "+ nomeDoNinja);
        System.out.println("Escreva aqui idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("Idade do ninja eh: "+ idadeDoNinja+" anos");


        if (idadeDoNinja>=18){
            System.out.println("Ninja ja eh maior de idade, logo pode sair da vila.");
        }else {
            System.out.println("Esse ninja eh muito novo, nao pode sair da vila.");
        }
        caixaDeTexto.close();
        }



}
