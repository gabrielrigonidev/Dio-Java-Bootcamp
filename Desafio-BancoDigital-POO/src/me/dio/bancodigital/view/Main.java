package me.dio.bancodigital.view;
import me.dio.bancodigital.model.*;
import me.dio.bancodigital.controller.*;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o nome do Banco: ");
      String nomeBanco = sc.next();
      Banco banco = new Banco();
      banco.setNome(nomeBanco);

      System.out.println("Criar Cliente: ");
      System.out.println("Digite seu Nome: ");

      String nome = sc.next();
      Cliente cliente = new Cliente();
      cliente.setNome(nome);
      System.out.println("Qual tipo de Conta você quer criar?");
      short resp = sc.nextShort();
      if (resp == 1) {
         Conta cc = banco.criarContaCorrente(cliente);
         banco.adicionarConta(cc);
      } else if (resp == 2) {
         Conta cp = banco.criarContaPoupanca(cliente);
         banco.adicionarConta(cp);
      }

      while(true) {
         System.out.println("-----------------------------------------------");
         System.out.println("1 - Listar Contas | 2 - Depositar | 3 - Sacar | 4 - Criar outra conta | 5 - Transferir");
         short respMenu = sc.nextShort();

         if (respMenu == 1) {
            banco.listarContas();
         } else if (respMenu == 2) {
            System.out.println("Selecione a Conta:");
            short respConta = sc.nextShort();
            System.out.println("Valor a ser depositado na Conta:");
            int deposito = sc.nextInt();
            banco.depositar(respConta, deposito);
         } else if (respMenu == 3) {
            System.out.println("Selecione a Conta:");
            short respConta = sc.nextShort();
            System.out.println("Valor a ser sacado da Conta:");
            int saque = sc.nextInt();
            banco.sacar(respConta, saque);
         } else if (respMenu == 4) {
            System.out.println("Criar Cliente: ");
            System.out.println("Digite seu Nome: ");
            nome = sc.next();
            cliente = new Cliente();
            cliente.setNome(nome);
            System.out.println("Qual tipo de Conta você quer criar?");
            resp = sc.nextShort();
            if (resp == 1) {
               Conta cc = banco.criarContaCorrente(cliente);
               banco.adicionarConta(cc);
            } else if (resp == 2) {
               Conta cp = banco.criarContaPoupanca(cliente);
               banco.adicionarConta(cp);
            }
         } else if (respMenu == 5){
            System.out.println("Selecione a Conta:");
            short respConta = sc.nextShort();
            System.out.println("Digite a Conta para depositar: ");
            short respDeposita = sc.nextShort();
            System.out.println("Digite o valor a depositar: ");
            short valor = sc.nextShort();
            banco.transferir(respConta, respDeposita, valor);
         }
      }
   }
}