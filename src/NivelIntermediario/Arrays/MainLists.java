package NivelIntermediario.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MainLists {
    public static void main(String[] args) {
        //Lista tradicional
        String [] ninjasArrays= new String[3];
        ninjasArrays[2] = "Naruto";
        //Arrays nao alteram seu tamanho
        // Listas, tem tamanho dinamico
        //Como fazer uma lista
        List <String> ninjaLIst  = new ArrayList<>();
        ninjaLIst.add("Uzumaki");
        ninjaLIst.add("tobirama senju");

        System.out.println(ninjaLIst);
        ninjaLIst.remove("Uzumaki");



        //trocar
        ninjaLIst.set(0,"Hashirama senju");

        //ver o tamanho da lista
        System.out.println(ninjaLIst.size());
    }
}

