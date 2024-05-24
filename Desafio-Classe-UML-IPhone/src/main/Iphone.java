package main;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusica;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {
   @Override
   public void ligar(int numero) {
      System.out.println("Ligando para o número: " + numero);
   }

   @Override
   public void atender() {
      System.out.println("Atendendo a chamada...");
   }

   @Override
   public void correioVoz() {
      System.out.println("Iniciando o correio de voz...");
   }

   @Override
   public void exibirPagina(String url) {
      System.out.println("Exibindo a página: " + url);
   }

   @Override
   public void novaAba() {
      System.out.println("Adicionando uma nova aba...");
   }

   @Override
   public void atualizarPagina() {
      System.out.println("Atualizando a página...");
   }

   @Override
   public void tocar() {
      System.out.println("Tocando música...");
   }

   @Override
   public void pausar() {
      System.out.println("Música pausada.");
   }

   @Override
   public void selecionarMusica(String musica) {
      System.out.println("Selecionando a música: " + musica);
   }
}