package Condicoes;

public class ifEElse {
    public static void main(String[] args) {
        /*
        * Objetivo: Passar ninja de nivel de acordo com o numero de missoes
        *
        * */
        int idade = 16;
        short missoes = 14;
        String nome = "Naruto Uzumaki";
        boolean hokage = false;

        String rank;


//        String titulo = "Cho"
        System.out.println(missoes);
        if (missoes > 10 && idade >15){
            System.out.println(nome + " esta pronto para passar de nivel");
            missoes = 5;
            System.out.println(missoes);
        } else if (missoes >=20) {
            rank = "Jounin";
            System.out.println(rank);
        } else {
            System.out.println(nome + " nao completou o numero de missoes minima");

        }

        
    }
}
