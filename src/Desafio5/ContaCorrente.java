package Desafio5;

public class ContaCorrente extends ContaBancaria{


    public ContaCorrente(double saldo,TipoConta tipo){
        super(saldo,tipo);

    }


    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Seu saldo atual é de: "+this.saldo);

    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é :" + this.saldo);
    }

    @Override
    public void transferirEntreConta(ContaBancaria recebedor, double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            recebedor.saldo+= valor;
        }

        else{
            System.out.println("Desculpe, saldo insuficiente para fazer a transferência! ");

        }
    }
}
