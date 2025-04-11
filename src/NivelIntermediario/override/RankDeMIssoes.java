package NivelIntermediario.override;

public enum RankDeMIssoes {
    //Niveis de dificuldade das missoes.
    //Só podemos usar um enum
    S("Muito Dificil",8),
    A("Dificil",5),
    B("Moderado",3),
    C("Baixo",2),
    D("Muito Baixo",1);


    private String descricao;
    private int dificuldade;

    RankDeMIssoes(String descricao, int dificuldade){
        this.descricao=descricao;
        this.dificuldade=dificuldade;
    }
}
