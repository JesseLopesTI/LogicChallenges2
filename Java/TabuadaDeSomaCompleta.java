/**
 * Classe que imprime a tabuada de soma completa dos números de 0 e 10.
 *
 * @author Jessé Lopes
 *
 **/

public class TabuadaDeSomaCompleta {

  public static void main(String[] args) {

    for (int unidade = 0; unidade <= 10; unidade++) {
      System.out.println("\n" + "A tabuada do número " + unidade + " é:" + "\n");
      for (int dezena = 0; dezena <= 10; dezena++) {
        System.out.println(unidade + " + " + dezena + " = " + (unidade + dezena));
      }
    }
  }
}