package me.dio.bancodigital.model;
import java.util.Random;

public abstract class Conta implements IConta {
   private static final int AGENCIA_PADRAO = 1;
   private static final int LIMITE_NUMERO = 10000;
   private static Random random = new Random();

   protected int agencia;
   protected int numero;
   protected double saldo;
   protected Cliente cliente;

   public Conta(Cliente cliente) {
      this.agencia = Conta.AGENCIA_PADRAO;
      this.numero = random.nextInt(LIMITE_NUMERO);
      this.cliente = cliente;
   }
   public int getAgencia() {
      return agencia;
   }
   public int getNumero() {
      return this.numero;
   }
   public double getSaldo() {
      return this.saldo;
   }
   @Override
   public void sacar(double valor) {
      if(this.saldo >= valor) {
         this.saldo -= valor;
      }
   }
   @Override
   public void depositar(double valor) {
      this.saldo += valor;
   }
   @Override
   public void transferir(double valor, IConta contaDestino) {
      this.sacar(valor);
      contaDestino.depositar(valor);
   }
   @Override
   public String toString() {
      return "Conta{" +
              "Titular = '" + cliente.getNome() + '\'' +
              ", Agência = " + this.getAgencia() +
              ", Número = " + this.getNumero() +
              ", Saldo = " + this.getSaldo() + '}';
   }
}