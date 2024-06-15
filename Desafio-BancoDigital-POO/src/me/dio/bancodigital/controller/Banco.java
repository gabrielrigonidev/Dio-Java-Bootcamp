package me.dio.bancodigital.controller;
import me.dio.bancodigital.model.Cliente;
import me.dio.bancodigital.model.Conta;
import me.dio.bancodigital.model.ContaCorrente;
import me.dio.bancodigital.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
   private String nome;
   private List<Conta> contas = new ArrayList<>();
   
   public void setNome(String nome) {
      this.nome = nome;
   }
   public List<Conta> getContas() {
      return this.contas;
   }

   public Conta criarContaCorrente(Cliente cliente) {
      return new ContaCorrente(cliente);
   }
   public Conta criarContaPoupanca(Cliente cliente) {
      return new ContaPoupanca(cliente);
   }
   public void adicionarConta(Conta conta) {
      this.contas.add(conta);
   }

   public void depositar(int numeroConta, double valor) {
      Conta conta = buscarContaPorNumero(numeroConta);
      if (conta != null) {
         conta.depositar(valor);
         System.out.println("Valor depositado com sucesso!");
      } else {
         System.out.println("Conta não encontrada.");
      }
   }

   public void sacar(int numeroConta, double valor) {
      Conta conta = buscarContaPorNumero(numeroConta);
      if (conta != null) {
         conta.sacar(valor);
         System.out.println("Valor sacado com sucesso!");
      } else {
         System.out.println("Conta não encontrada.");
      }
   }
   private Conta buscarContaPorNumero(int numero) {
      for (Conta conta : getContas()) {
         if (conta.getNumero() == numero) {
            return conta;
         }
      }
      return null;
   }
   public void listarContas() {
      for (Conta conta : getContas()) {
         System.out.println(conta);
      }
   }
   public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {
      Conta contaOrigem = buscarContaPorNumero(numeroContaOrigem);
      Conta contaDestino = buscarContaPorNumero(numeroContaDestino);

      if (contaOrigem != null && contaDestino != null && contaOrigem.getSaldo() > valor) {
         contaOrigem.transferir(valor, contaDestino);
      } else {
         System.out.println("Não foi possível transferir.");
      }
   }
}