/**
 * Classe que realiza cálculos básicos de uma calculadora.
 *
 * @author Jessé Lopes
 *
 **/

import java.util.Scanner;

public class CalculadoraBasica {

  public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in)) {

      double valor1;
      double valor2;
      int escolha;
      double soma;
      double subtracao;
      double multiplicacao;
      double divisao;

      do {
        System.out.print("\nDigite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.println("\nSoma: 1" + "\nSubtração: 2" + "\nMultiplicação: 3" + "\nDivisão: 4");
        System.out.print("\nEscolha o valor correspondente ao tipo de operação: ");
        escolha = scanner.nextInt();

        while (escolha >= 5) {
          System.out.print("\nAtenção!\n" + "\nUse apenas os valores correspondentes aos tipos de operação.\n");

          System.out.println("\nSoma: 1" + "\nSubtração: 2" + "\nMultiplicação: 3" + "\nDivisão: 4");
          System.out.print("\nDigite o valor correspondente: ");
          escolha = scanner.nextInt();

          escolha++;
        }

        System.out.print("\nDigite o segundo valor: ");
        valor2 = scanner.nextDouble();
  
        switch(escolha) {
          case 1:
            soma = valor1 + valor2;

            System.out.println("\nO resultado é: " + soma);
            break;
          case 2:
            subtracao = valor1 - valor2;

            System.out.println("\nO resultado é: " + subtracao + ". (Ignorar sinal de negativo).");
            break;
          case 3:
            multiplicacao = valor1 * valor2;

            System.out.println("\nO resultado é: " + multiplicacao);
            break;
          default:
            divisao = valor1 / valor2;

            System.out.println("\nO resultado é: " + divisao);
            break;
        }
      } while (escolha <= 4);
    }
  }
}