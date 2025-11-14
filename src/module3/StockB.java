package module3;

import java.util.Scanner;

public class StockB {

  public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    System.out.print("Quel est le stock initial ? ");
    int stockInitial = clavier.nextInt();
    System.out.print("Quel est le seuil d'alerte ? ");
    int seuilAlerte = clavier.nextInt();
    System.out.print("Combien de jours doit durer la simulation ? ");
    int duréeSimulation = clavier.nextInt();

    int jourActuel = 1;
    int stockActuel = stockInitial;
    while (jourActuel <= duréeSimulation) {
      System.out.println("\nJour " + jourActuel);
      System.out.println("------");
      System.out.print("Quantité de produits reçue ? ");
      int qtéProduitsReçue = clavier.nextInt();
      System.out.print("Quantité de produits vendue ? ");
      int qtéProduitsVendue = clavier.nextInt();

      stockActuel = stockActuel + qtéProduitsReçue - qtéProduitsVendue;
      System.out.println("Le stock actuel est de : " + stockActuel);


      jourActuel = jourActuel + 1;
    }
  }
}
