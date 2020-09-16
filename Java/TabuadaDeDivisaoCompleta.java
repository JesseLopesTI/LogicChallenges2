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

    for (int contador = 0; contador <= 10; contador++) {
      System.out.println(contador + " / " + numero1 + " = " + contador / numero1);
    }

    System.out.println("\n" + "A tabuada do número " + numero2 + " é:" + "\n");

    for (int contador = 0; contador <= 20; contador = contador + 2) {
      System.out.println(contador + " / " + numero2 + " = " + contador / numero2);
    }

    System.out.println("\n" + "A tabuada do número " + numero3 + " é:" + "\n");

    for (int contador = 0; contador <= 30; contador = contador + 3) {
      System.out.println(contador + " / " + numero3 + " = " + contador / numero3);
    }

    System.out.println("\n" + "A tabuada do número " + numero4 + " é:" + "\n");

    for (int contador = 0; contador <= 40; contador = contador + 4) {
      System.out.println(contador + " / " + numero4 + " = " + contador / numero4);
    }

    System.out.println("\n" + "A tabuada do número " + numero5 + " é:" + "\n");

    for (int contador = 0; contador <= 50; contador = contador + 5) {
      System.out.println(contador + " / " + numero5 + " = " + contador / numero5);
    }

    System.out.println("\n" + "A tabuada do número " + numero6 + " é:" + "\n");

    for (int contador = 0; contador <= 60; contador = contador + 6) {
      System.out.println(contador + " / " + numero6 + " = " + contador / numero6);
    }

    System.out.println("\n" + "A tabuada do número " + numero7 + " é:" + "\n");

    for (int contador = 0; contador <= 70; contador = contador + 7) {
      System.out.println(contador + " / " + numero7 + " = " + contador / numero7);
    }

    System.out.println("\n" + "A tabuada do número " + numero8 + " é:" + "\n");

    for (int contador = 0; contador <= 80; contador = contador + 8) {
      System.out.println(contador + " / " + numero8 + " = " + contador / numero8);
    }

    System.out.println("\n" + "A tabuada do número " + numero9 + " é:" + "\n");

    for (int contador = 0; contador <= 90; contador = contador + 9) {
      System.out.println(contador + " / " + numero9 + " = " + contador / numero9);
    }

    System.out.println("\n" + "A tabuada do número " + numero10 + " é:" + "\n");

    for (int contador = 0; contador <= 100; contador = contador + 10) {
      System.out.println(contador + " / " + numero10 + " = " + contador / numero10);
    }
  }
}