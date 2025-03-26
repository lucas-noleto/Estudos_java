package Desafio5;

public class Banco {
    public static void main(String[] args) {


        ContaCorrente lucas = new ContaCorrente(1000,TipoConta.CORRENTE);
        ContaPoupanca gab = new ContaPoupanca(2000,TipoConta.POUPANCA);

        lucas.consultarSaldo();
        lucas.depositar(10);


        gab.consultarSaldo();
        gab.depositar(1220);



        lucas.transferirEntreConta(gab,500);
        lucas.consultarSaldo();
        //gab.consultarSaldo();

    }
}
