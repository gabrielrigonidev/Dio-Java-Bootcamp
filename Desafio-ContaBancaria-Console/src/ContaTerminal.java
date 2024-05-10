import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Bem vindo ao banco Roberth. O que podeos fazer por você hoje? Por favor, digite COMEÇAR para entrar em sua conta");

      System.out.println("Passo 1 | Digite seu nome:");
      String nome = sc.next();

      System.out.println("Passo 2 | Digite o Nº da Agência: ");
      String agencia = sc.next();

      System.out.println("Passo 3 | Digite o Nº da Conta: ");
      int conta = sc.nextInt();

      System.out.println("Qual o seu saldo?: ");
      double saldo = sc.nextDouble();

      System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque\".");
      }
   }