package NivelIntermediario.override;

public class Missoes {
    private String nome;
    private RankDeMIssoes rank;

    public void Missoes(){}
    public void Missoes (String nome, RankDeMIssoes rank){
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void exibirDetalhes(){
        System.out.println("Missão: "+nome + " Rank: " +rank);
    }


}
