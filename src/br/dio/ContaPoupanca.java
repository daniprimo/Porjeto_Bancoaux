package br.dio;

public abstract class ContaPoupanca extends Conta {
    /*
    * Classe Filha da "Classe Conta" para gerenciar funções dentro das  poupanças
    *
    * @author: Daniel Lopes    *
    * */

    //Construtor da "ContaPoupança"

    public ContaPoupanca (Cliente cliente) {
        super(cliente);
    }


    // Metodos e funcionalidades da "ContaPoupança"
    @Override
    public void infosDasContas (){
        System.out.println("*** Extrato Conta Poupança ***");
        super.infosDasContas();
    }





}
