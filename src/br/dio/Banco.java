package br.dio;

import java.util.List;
import java.util.Scanner;

public  class Banco {
    Scanner scan = new Scanner(System.in);

    public String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;


    public Banco(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }


    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }






}
