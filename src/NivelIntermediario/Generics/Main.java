package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja kunaiExplosiva = new EquipamentosNinja("Kunai explosiva");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");
        Bastao bastao = new Bastao("Bastão do mamaco");

        //Da forma abaixo nao vai dar certo, precisa colocar Object dentro dos jacares
        //BolsaGenerica<EquipamentosNinja> bolsaGenerica= new BolsaGenerica<>();
        BolsaGenerica<Object> bolsaGenerica= new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunaiExplosiva);
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
        bolsaGenerica.adicionarEquipamentos(bastao);

        System.out.println(bolsaGenerica);


    }
}
