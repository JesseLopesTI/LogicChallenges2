/**
 * Classe que imprime a tabuada completa de um número entre 0 e 10.
 *
 * @author Jessé Lopes
 *
 **/

import java.util.Scanner;

public class TabuadaCompleta {

  public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in)) {

      int numero;

      do {
        System.out.print("\n" + "Digite um número entre 0 e 10: ");
        numero = scanner.nextInt();

        while (numero > 10) {
          System.out.println("\n" + "Observação:");
          System.out.println("\n" + "Só é permitido um número entre 0 e 10. Tente novamente!");
          System.out.print("\n" + "Digite um número entre 0 e 10: ");
          numero = scanner.nextInt();

          numero = numero + 0;
        }

        System.out.println("\n" + "A tabuada de soma do número " + numero + " é:");

        for (int contador = 0; contador <= 10; contador++) {
          System.out.println("\n" + numero + " + " + contador + " = " + (numero + contador));
        }

        System.out.println("\n" + "A tabuada de subtração do número " + numero + " é:");

        for (int contador = 0; contador <= 10; contador++) {
          System.out.println("\n" + numero + " - " + contador + " = " + (numero - contador));
        }

        System.out.println("\n" + "A tabuada de multiplicação do número " + numero + " é:");

        for (int contador = 0; contador <= 10; contador++) {
          System.out.println("\n" + numero + " * " + contador + " = " + (numero * contador));
        }

        switch(numero) {
          case 1:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 10; contador++) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          case 2:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 20; contador = contador + 2) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          case 3:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 30; contador = contador + 3) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          case 4:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 40; contador = contador + 4) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          case 5:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 50; contador = contador + 5) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          case 6:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 60; contador = contador + 6) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          case 7:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 70; contador = contador + 7) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          case 8:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 80; contador = contador + 8) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          case 9:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");

            for (int contador = 0; contador <= 90; contador = contador + 9) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
          default:
            System.out.println("\n" + "A tabuada de divisão do número " + numero + " é:");
  
            for (int contador = 0; contador <= 100; contador = contador + 10) {
              System.out.println("\n" + contador + " / " + numero + " = " + contador / numero);
            }

            break;
        }
      } while (numero <= 10);
    }
  }
}