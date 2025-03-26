package Desafio5;

public abstract class ContaBancaria implements Conta{
    double saldo;
    TipoConta tipo;

    public ContaBancaria(double saldo, TipoConta tipo){
        this.saldo=saldo;
        this.tipo = tipo;
    }
}
