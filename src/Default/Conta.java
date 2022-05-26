package Default;


public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;




    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirInfosComuns() {
        printar("Cliente: %s", this.cliente.getNome());
        printar("Agencia: %d", this.agencia);
        printar("Numero: %d", this.numero);
        printar("Saldo: %.2f", this.saldo);

    }




    @Override
    public void sacar(double valor) {
        if(getSaldo() > 0){
            setSaldo(getSaldo() - valor);
        }else{
            System.out.println("Não possui dinheiro na conta!");
        }

    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
            if(getSaldo() > 0) {
                setSaldo(getSaldo() - valor);
                contaDestino.depositar(valor);
        }else{
                System.out.println("Sua conta não possui o valor selecionado!!");
            }
    }


    protected void printar(String informacao, int valor) {
        System.out.println(String.format(informacao, valor));
    }

    protected void printar(String informacao, double valor) {
        System.out.println(String.format(informacao, valor));
    }
    protected void printar(String informacao, String valor) {
        System.out.println(String.format(informacao, valor));
    }



    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private int getAgencia() {
        return agencia;
    }

    private int getNumero() {
        return numero;
    }

    private double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}

