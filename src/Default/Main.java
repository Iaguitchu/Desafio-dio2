package Default;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mathias");
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);
        cc.depositar(200);
        cc.transferir(20,poupanca);
        cc.sacar(10);



        //poupanca.depositar(200);
        //poupanca.transferir(10,poupanca);
        //poupanca.sacar(20);

        cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}
