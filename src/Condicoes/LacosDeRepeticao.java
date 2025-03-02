package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        *
        * Laços de repetição vao repetir infinitamente ou ate atingir o parametro de parada
        *
        * WHILE//FOR
        *
        *
        *
        * */


        // While
        // While (condicao) { tudo oque pode ser feito}


        int numeroDeClones = 0;
        int numeroMaxClones = 40;

//
        while (numeroDeClones <= numeroMaxClones){

            System.out.println("Naruto fez mais um clone das sombras, total de clones: " + numeroDeClones );
            numeroDeClones++;
        }

        //FOR
        // for(condição inicial; condição de parada; passo) {tudo oq pode ser feito}
        for (int i = 0; i <= numeroMaxClones ; i++) {
            System.out.println("Naruto fez mais um clone das sombras, total de clones: " + i);
        }
    }
}
