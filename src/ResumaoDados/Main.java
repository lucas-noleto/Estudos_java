package ResumaoDados;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Array
        String[] nomeninjaArray = new String[3];
        nomeninjaArray[2] = "Obtio";

        //Listas
        //Lista é um pouco mais lenta
        //Listas sao dinamicas
        List<String> nomeninjaLista = new ArrayList<>();
        nomeninjaLista.add("hatake Kakashi");

        //Pilha
        // existe uma ordem
        Stack<String> exemploPilha = new Stack<>();
        exemploPilha.push("ninja");

        //QEUE
        //Primeiro a entrar eh o primeiro a sair
        Queue<String> ninjasQeue = new LinkedList<>();
        ninjasQeue.add("Sasuke");
        ninjasQeue.add("Naruto");
        ninjasQeue.add("Shikamru");
        ninjasQeue.add("Tobirama Senju");

        System.out.println(ninjasQeue);
        //Tirar um ninja da fila

        //Tira o head da lista
        //Poll
        ninjasQeue.poll();

        //Pick ve o primeiro da fila
        ninjasQeue.peek();

        //Como é uma fila, nao conseguimos retirar nenhum cara em especifico a nao ser o primeiro que entrou, o mesmo vale para stack

        //Verificar se esta vazia
        if (ninjasQeue.isEmpty()){
            System.out.println("Ta vazio");
        }

        





    }
}
