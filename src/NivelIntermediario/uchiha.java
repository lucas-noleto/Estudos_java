package NivelIntermediario;

public class uchiha extends ninja{
    //Criando um construtor da subclasse uchiha
    public uchiha(){
        //Para aproveitar o contrutor da super classe Ninja, precisamos usar o super.
        super();
    }

    //Criando um construtor para uma subclasse baseada na super classe ninja
    public uchiha(String nome,String aldeia, int idade){
        super(nome,aldeia,idade);
    }
    public void SharinganAtivado() {
        System.out.println("O Sharingan ativou");
    }




}
