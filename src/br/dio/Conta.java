package br.dio;

public abstract class Conta implements InterfaceConta  {

    private static int SEQUENCIALAGENCIA = 0015;
    private static int SEQUENCIAL = 1;

    protected int  agencia;
    protected int  numeroConta;
    protected double saldo;
    protected Cliente cliente;




    public Conta  (Cliente cliente) {
        this.agencia = SEQUENCIALAGENCIA;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }




    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }




    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    //metodos da conta

    public void infosDasContas() {

        /*System.out.println(String.format("Cliente: %s", this.cliente.getNomeCompleto()));*/
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));


    }








}
