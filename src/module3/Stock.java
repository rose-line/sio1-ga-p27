package module3;

import java.util.Scanner;

public class Stock {

  public static void main(String[] args) {

    Scanner clavier = new Scanner(System.in);

    System.out.print("Quel est le stock initial ? ");
    int stockInitial = clavier.nextInt();
    System.out.print("Quel est le seuil d'alerte ? ");
    int seuilAlerte = clavier.nextInt();
    System.out.print("Combien de jours doit durer la simulation ? ");
    int nbJours = clavier.nextInt();

    int stockActuel = stockInitial;
    int numJour = 1;
    while (numJour <= nbJours) {
      System.out.println("Jour " + numJour);
      System.out.println("------");
      System.out.print("Quantité de produits reçue ? ");
      int nbReçus = clavier.nextInt();
      System.out.print("Quantité de produits vendue ? ");
      int nbVendus = clavier.nextInt();
      stockActuel = stockActuel + nbReçus - nbVendus;
      System.out.print("Le stock actuel est de : " + stockActuel);

      numJour = numJour + 1; // numJour += 1 ; numJour++
    }

    clavier.close();

  }
}
