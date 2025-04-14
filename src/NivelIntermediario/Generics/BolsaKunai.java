package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {

    private List<Kunai> kunais;

    public BolsaKunai() {
        this.kunais = new ArrayList<>();
    }

    public BolsaKunai(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString(){
        return "Bolsa kunai : "+kunais.toString() ;
    }

    public void adicionarKunai(Kunai kunai){
        kunais.add(kunai);
    }

}
