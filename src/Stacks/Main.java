package Stacks;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Array
        //Sao estaticos e tem ref de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0]= "Naruto Uzumaki";

        //Lista
        //Sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        //Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        //Metodos
        //Push -> adiciona
        //Pop -> retira o elemento mais recente
        //Peek -> verifica qual o proximo
        //Size -> diz o tamanho da stack


        ninjaStack.add("Naruto uzumaki");
        System.out.println("Minha stack atual = " + ninjaStack);
        ninjaStack.push("sasuke uchiha");
        ninjaStack.push("obito uchiha");
        ninjaStack.pop();
        System.out.println("minha stack atual depois do pop = "+ ninjaStack);
        System.out.println("proximo elemento "+ ninjaStack.peek());
        System.out.println("Tamanho da pilha "+ ninjaStack.size());

    }
}
