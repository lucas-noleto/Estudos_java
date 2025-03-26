package Desafio5;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo, TipoConta tipo){
        super(saldo,tipo);

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor - valor/100;
        System.out.println("Valor depositado com sucesso! Taxa de administração :" + valor/100);
        System.out.println("Seu saldo atual é de: "+this.saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é :" + this.saldo);
    }

    @Override
    public void transferirEntreConta(ContaBancaria recebedor, double valor) {

    }


}
