/**
 * Classe que imprime a tabuada de divisão completa dos números entre 1 e 10.
 *
 * @author Jessé Lopes
 *
 **/

public class TabuadaDeDivisaoCompleta {

  public static void main(String[] args) {

    int numero1 = 1;
    int numero2 = 2;
    int numero3 = 3;
    int numero4 = 4;
    int numero5 = 5;
    int numero6 = 6;
    int numero7 = 7;
    int numero8 = 8;
    int numero9 = 9;
    int numero10 = 10;

    System.out.println("\n" + "A tabuada do número " + numero1 + " é:" + "\n");

    for (int dezena = 0; dezena <= 10; dezena++) {
      System.out.println(dezena + " / " + numero1 + " = " + dezena / numero1);
    }

    System.out.println("\n" + "A tabuada do número " + numero2 + " é:" + "\n");

    for (int dezena = 0; dezena <= 20; dezena = dezena + 2) {
      System.out.println(dezena + " / " + numero2 + " = " + dezena / numero2);
    }

    System.out.println("\n" + "A tabuada do número " + numero3 + " é:" + "\n");

    for (int dezena = 0; dezena <= 30; dezena = dezena + 3) {
      System.out.println(dezena + " / " + numero3 + " = " + dezena / numero3);
    }

    System.out.println("\n" + "A tabuada do número " + numero4 + " é:" + "\n");

    for (int dezena = 0; dezena <= 40; dezena = dezena + 4) {
      System.out.println(dezena + " / " + numero4 + " = " + dezena / numero4);
    }

    System.out.println("\n" + "A tabuada do número " + numero5 + " é:" + "\n");

    for (int dezena = 0; dezena <= 50; dezena = dezena + 5) {
      System.out.println(dezena + " / " + numero5 + " = " + dezena / numero5);
    }

    System.out.println("\n" + "A tabuada do número " + numero6 + " é:" + "\n");

    for (int dezena = 0; dezena <= 60; dezena = dezena + 6) {
      System.out.println(dezena + " / " + numero6 + " = " + dezena / numero6);
    }

    System.out.println("\n" + "A tabuada do número " + numero7 + " é:" + "\n");

    for (int dezena = 0; dezena <= 70; dezena = dezena + 7) {
      System.out.println(dezena + " / " + numero7 + " = " + dezena / numero7);
    }

    System.out.println("\n" + "A tabuada do número " + numero8 + " é:" + "\n");

    for (int dezena = 0; dezena <= 80; dezena = dezena + 8) {
      System.out.println(dezena + " / " + numero8 + " = " + dezena / numero8);
    }

    System.out.println("\n" + "A tabuada do número " + numero9 + " é:" + "\n");

    for (int dezena = 0; dezena <= 90; dezena = dezena + 9) {
      System.out.println(dezena + " / " + numero9 + " = " + dezena / numero9);
    }

    System.out.println("\n" + "A tabuada do número " + numero10 + " é:" + "\n");

    for (int dezena = 0; dezena <= 100; dezena = dezena + 10) {
      System.out.println(dezena + " / " + numero10 + " = " + dezena / numero10);
    }
  }
}