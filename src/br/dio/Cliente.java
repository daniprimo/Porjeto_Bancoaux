package br.dio;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class Cliente {
    Scanner scan = new Scanner(System.in);

    Conta aux;


    private String nome;
    private String nomeCompleto;
    private String endereço;
    private String cpf;
    private String rg;
    private String numeroTelefone;
    private double salarioMensal;



     //Gettes and Setts

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodos

    public void infoDosCLientes() {

        System.out.println(String.format("Cliente: "+ this.getNomeCompleto()));
        System.out.println(String.format("CPF: %s", this.getCpf()));
        System.out.println(String.format("RG: %s", this.getRg()));
        System.out.println(String.format("Endereço: %s", this.getEndereço()));
        System.out.println(String.format("Telefone: %s", this.getNumeroTelefone()));
        System.out.println(String.format("Salario: R$%.2f%n", this.getSalarioMensal()));


    }

    public void cadastrarClientes (){

        System.out.printf ("Nome: "); nome = scan.nextLine();
        setNome(nome);
        System.out.printf ("CPF: ") ; cpf = scan.nextLine();
        setCpf(cpf);
        System.out.printf ("RG: "); rg = scan.nextLine();
        setRg(rg);
        System.out.printf ("Endereço: "); endereço = scan.nextLine();
        setEndereço(endereço);
        System.out.printf ("Telefone: "); numeroTelefone = scan.nextLine();
        setNumeroTelefone(numeroTelefone);
        System.out.printf ("Salario: R$"); salarioMensal = scan.nextDouble();
        setSalarioMensal(salarioMensal);


    }

}
