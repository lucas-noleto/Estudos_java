package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja kunaiExplosiva = new EquipamentosNinja("Kunai explosiva");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica= new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunaiExplosiva);
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);


    }
}
