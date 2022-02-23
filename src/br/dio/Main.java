package br.dio;


import java.io.IOException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args){

      Scanner scan = new Scanner(System.in);

      Cliente daniel = new Cliente();
      daniel.setNomeCompleto("Daniel Lopes Sousa Moreira");
      daniel.setNome("Daniel");
      daniel.setCpf("450.832.198-40");
      daniel.setRg("52.801.256-3");
      daniel.setEndereço("Rua Ipixuna, 141");
      daniel.setNumeroTelefone("(11) 98585-0569");
      daniel.setSalarioMensal(37000);
      Conta ccDaniel = new ContaCorrente(daniel);
      Conta cpDaniel = new ContaCorrente(daniel);
      ccDaniel.depositar(30000);
      cpDaniel.depositar(15000);


      Cliente pedro = new Cliente();
      pedro.setNomeCompleto("Pedro Lopes Sousa Moreira");
      pedro.setNome("Pedro");
      pedro.setCpf("254.457.857-5");
      pedro.setRg("58.801.457-8");
      pedro.setEndereço("Rua Ipixuna, 141");
      pedro.setNumeroTelefone("(11) 97777-0287");
      pedro.setSalarioMensal(20000);
      Conta ccPedro = new ContaCorrente(pedro);
      Conta cpPedro = new ContaCorrente(pedro);
      ccPedro.depositar(30000);
      cpPedro.depositar(12444);
      ccPedro.transferir(1000, cpDaniel);


      Cliente novo = new Cliente();
      Conta corrente = new ContaCorrente(novo);
      Conta poupanca = new ContaPoupanca(novo);
/*
    do {

      int opcao;

      System.out.println("*** Impact Bank ***");
      System.out.println("[1] - Cadastrar cliente.");
      System.out.println("[2] - Depositar Conta Corrente.");
      System.out.println("[3] - Depositar Conta Poupança.");
      System.out.println("[4] - Contas Cadastradas");
      System.out.println("[5] - Sair");
      System.out.printf("Digite sua opção: ");
      opcao = scan.nextInt();



      switch (opcao) {
        case 1:
          novo.cadastrarClientes();
          break;
        case 2:
          System.out.printf("Digite o valor que deseja depositar: R$:");
          double deposito = scan.nextDouble();
          corrente.depositar(deposito);
          break;
        case 3:
          System.out.printf("Digite o valor que deseja Transferir: R$:");
          double transferir = scan.nextDouble();
          corrente.transferir(transferir,ccDaniel);
          break;
        case 4:
          System.out.println("*** Extrato Conta Corrente ***");
          corrente.infosDasContas();
          System.out.println("Saldos Total: "+ (corrente.getSaldo()+ poupanca.getSaldo() ));
          System.out.println("*** Extrato Conta Poupança ***");
          poupanca.infosDasContas();
          break;
        case 5:

          break;
      }
    }while (true);
*/




    }






}

