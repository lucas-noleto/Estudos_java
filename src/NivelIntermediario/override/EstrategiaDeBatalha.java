package NivelIntermediario.override;

public interface EstrategiaDeBatalha {
    //por padrao, atributos em interfaces, sao final e precisam ser inicializadas.
    String nome = "estrategia de batalha";

    void inteligenciaDeCombate();

    void inteligenciaDeCombate( int qi);
}
