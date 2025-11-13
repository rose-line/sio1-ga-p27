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
      System.out.println("\nJour " + numJour);
      System.out.println("------");
      System.out.print("Quantité de produits reçue ? ");
      int nbReçus = clavier.nextInt();
      System.out.print("Quantité de produits vendue ? ");
      int nbVendus = clavier.nextInt();
      stockActuel = stockActuel + nbReçus - nbVendus;
      System.out.println("Le stock actuel est de : " + stockActuel);

      // if ((stockActuel <= seuilAlerte) && (stockActuel >= 0)) {
      // System.out.println("ATTENTION : le stock est sous le seuil d'alerte !");
      // }

      // if (stockActuel < 0) {
      // System.out.println("ERREUR : le stock est négatif. Simulation arrêtée.");
      // }
      if (stockActuel < 0) {
        System.out.println("ERREUR : le stock est négatif. Simulation arrêtée.");
        break;
      } else if (stockActuel <= seuilAlerte) {
        System.out.println("ATTENTION : le stock est sous le seuil d'alerte !");
      }

      numJour = numJour + 1; // numJour += 1 ; numJour++
    }

    if (stockActuel < 0) {
      System.out.println("Simulation terminée. Stock final : " + stockActuel + " unités");
    }

    clavier.close();

  }
}
