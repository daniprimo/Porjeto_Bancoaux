package br.dio;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      Cliente primeiro = new Cliente();
        primeiro.cadastrarClientes();

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
      ccPedro.transferir(1000,cpDaniel);

      cpDaniel.infosDasContas();

      primeiro.infoDosCLientes();




      double corrente = ccDaniel.saldo + cpDaniel.saldo;






    }
}
