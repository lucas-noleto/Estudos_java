package HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> listaNinja= new ArrayList<>();
        listaNinja.add("tobirama");
        listaNinja.add("orochimaru");
        listaNinja.add("kabuto");
        listaNinja.add("Gaara");


        //O set é usado para ignorar itens duplicados dentro da nossa lista
        //O HashSet nao deixa ficar repetido, ordem eh aleatoria
        //Set <String> ninjasSet = new HashSet<>();

        //treeset coloca na sequencia correta da iteracao, ele ja poem os itens ordenados.Como temos uma string, ele vai ordenar por ordeem alfabetica.
        //Se fosse int, ficaria para ordem numerica
        Set <String> ninjasSet = new TreeSet<>();


        //LinkedHashSet faz a mesma coisa que o HashSet, mas insere por ordem de adicao
        //Set <String> ninjasSet = new LinkedHashSet<>();


        //Set verifica se tem itens duplicados e nao possui index
        //Nao importa a ordem de adicao, ele vai colocar ja em uma ordem estabelecida por ele, geralmente ordem alfabetica
        ninjasSet.add("Naruto Uzumaki");
        ninjasSet.add("Sasuke Uchiha");
        //transformando uma lista em um set
        ninjasSet.addAll(listaNinja) ;
        System.out.println(ninjasSet);
        //Nos sets, nao removemos igual as listas ou outras estruturas de dados.
        ninjasSet.remove("tobirama");
        System.out.println(ninjasSet);





    }
}
