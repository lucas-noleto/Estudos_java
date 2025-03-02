import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Arrays sao fixos, eles ocupam um espaço de memoria e dividem aquele espaço para todos que estão dentro do array
        // Se eu quisse salvar um nome numa variavel, aquele valor ficaria na caixa. Se eu salvo varios nomes num array, o array salva um espaço(caixa) e compartimentaliza aquele espaço
        // com todos que estavam naquele espaço.
        String [] ninjas = new String[4];
        Scanner nomeNinja = new Scanner(System.in);

        for (int i=0;i<4;i++){
            System.out.println("Por favor, insira o nome dos ninjas do time 7: ");
            String selecaoNome = nomeNinja.nextLine();
            ninjas[i] = selecaoNome;
        }
        nomeNinja.close();
        System.out.println("Os ninjas do time 7 são: ");
        for (int i = 0; i <4 ; i++) {
            System.out.println(ninjas[i]);

        }
        // Array de idade
        //inicializacao de arrays, array int é inicializado por 0, o campo vazio daquele cara eh zero. Para boolean é um false
        int [] idade = new int[2];
        System.out.println(idade[0]);

        boolean [] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso);

        //Redeclarando array
        //Ao redeclarar, a gente perde os valores antigos caso redeclare aquele array.
        idade = new int[4];

        String [] hokages = new String[7];
        hokages[0] = "Hashirama Senju";
        hokages[1] = "Tobirama Senju";
        hokages[2] = "Hiruzen Saturobi";
        hokages[3] = "Tsunade Senju";
        hokages[4] = "Kakashi Hatake";
        hokages[5] = "Naruto Uzumaki";
        hokages[6] = "Shikamaru Nara";

        System.out.println("Nome dos Hokages:");
        for (int i = 0; i < 7; i++) {
            System.out.println(hokages[i]);

        }


    }
}
