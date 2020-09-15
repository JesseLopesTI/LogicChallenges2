/**
 * Classe que imprime a tabuada de soma de um número entre 0 e 10.
 *
 * @author Jessé Lopes
 *
 **/

import java.util.Scanner;

public class TabuadaDeSoma {

  public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in)) {

      int numero;

      do {
        System.out.print("\n" + "Digite um número entre 0 e 10: ");
        numero = scanner.nextInt();

        if (numero <= 10) {
          System.out.println("\n" + "A tabuada do número " + numero + " é:");
        } else {
          while (numero > 10) {
            System.out.println("\n" + "Observação:");
            System.out.println("\n" + "Só é permitido um número entre 0 e 10. Tente novamente!");
            System.out.print("\n" + "Digite um número entre 0 e 10: ");
            numero = scanner.nextInt();

            numero = numero + 0;
          }

          System.out.println("\n" + "A tabuada do número " + numero + " é:");
        }

        for (int contador = 0; contador <= 10; contador++) {
          System.out.println("\n" + numero + " + " + contador + " = " + (numero + contador));
        }

      } while (numero <= 10);
    }
  }
}