package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> listaNinja= new ArrayList<>();
        listaNinja.add("tobirama");
        listaNinja.add("orochimaru");
        listaNinja.add("kabuto");
        listaNinja.add("Gaara");




        //O set é usado para ignorar itens duplicados dentro da nossa lista



        Set <String> ninjasSet = new HashSet<>();

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
