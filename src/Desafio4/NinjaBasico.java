package Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;


    habilidade habilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);



    }

    @Override
    public void executarHabilidade() {
        switch (habilidade){
            case TAIJUTSU:
                System.out.println("Habilidade : TAIJUTSU");
                break;
            case NINJUTSU:
                System.out.println("Habilidade : NINJUTSU");
                break;
            case GENJUTSU:
                System.out.println("Habilidade : GENJUTSU");
                break;
            case KATON:
                System.out.println("Habilidade : KATON");
                break;
            case RINNENGAN:
                System.out.println("Habilidade : RINNENGAN");
                break;
        }

    }

    public NinjaBasico (){}
    public NinjaBasico (String nome, int idade,habilidade habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}
