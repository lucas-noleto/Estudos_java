package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

//O simbolo <T> é para o uso de generics e o T é referente a Type
public class BolsaGenerica<T> {

    private List<T> equipamentos;

    // Construtor vazio inicializa a lista
    public BolsaGenerica() {

        this.equipamentos = new ArrayList<>();
    }

    public BolsaGenerica(List<T> equipamentos) {

        this.equipamentos = equipamentos;
    }

    public List<T> getEquipamentos() {

        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {

        this.equipamentos = equipamentos;
    }

    //Função para adicionar um equpamento. 
    public void adicionarEquipamentos(T equipamento){

        equipamentos.add(equipamento);
    }

    @Override
    public String toString(){

        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
