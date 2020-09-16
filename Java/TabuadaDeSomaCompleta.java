/**
 * Classe que imprime a tabuada de soma completa dos números entre 0 e 10.
 *
 * @author Jessé Lopes
 *
 **/

public class TabuadaDeSomaCompleta {

  public static void main(String[] args) {

    for (int numero = 0; numero <= 10; numero++) {
      System.out.println("\n" + "A tabuada do número " + numero + " é:" + "\n");
      for (int contador = 0; contador <= 10; contador++) {
        System.out.println(numero + " + " + contador + " = " + (numero + contador));
      }
    }
  }
}