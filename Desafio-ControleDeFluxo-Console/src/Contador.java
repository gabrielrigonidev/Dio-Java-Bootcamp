import java.util.Scanner;

public class Contador {
   public static void main(String[] args) {
      Scanner terminal = new Scanner(System.in);
      boolean continuar = true;

      while(continuar){
         System.out.println("Digite o primeiro parâmetro");
         int parametroUm = terminal.nextInt();
         System.out.println("Digite o segundo parâmetro");
         int parametroDois = terminal.nextInt();

         try {
            contar(parametroUm, parametroDois);
            System.out.println("Contagem realizada com sucesso!");
            continuar = false;
         }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
            System.out.println("--------------------------------------------------");
         }
      }
      terminal.close();
   }

   static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
      if(parametroUm > parametroDois) {
         throw new ParametrosInvalidosException();
      }

      int contagem = parametroDois - parametroUm;
      for(int i = 1; i <= contagem; i++) {
         System.out.println("Imprimindo o número " + i);
      }
   }
}