public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgenda(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor; // saldo += valor
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (valor > saldo) {
            System.out.println("Não foi possivel transferir");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferido");
        }

    }

        protected void imprimirItensComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero da Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
