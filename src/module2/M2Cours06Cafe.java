package module2;

import java.util.Scanner;

// Indiquer si l'on a de quoi se payer un café à 1 €, ou plus, ou moins
public class M2Cours06Cafe {
  public static void main(String[] args) {

    // Initialisation du Scanner et message d'introduction
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Bonjour ! Je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez :\n");

    // Récupération des données sur les pièces jaunes
    System.out.print("pièces de 1 cent ? ");
    int nb1Cent = scanner.nextInt();

    System.out.print("pièces de 5 cents ? ");
    int nb5Cents = scanner.nextInt();

    System.out.print("pièces de 10 cents ? ");
    int nb10Cents = scanner.nextInt();

    System.out.print("pièces de 20 cents ? ");
    int nb20Cents = scanner.nextInt();

    System.out.print("pièces de 50 cents ? ");
    int nb50Cents = scanner.nextInt();

    scanner.close();

    // Calcul du total
    // (on reste en centimes, ça permet de travailler avec des entiers uniquement)
    int total = nb1Cent * 1 + nb5Cents * 5 + nb10Cents * 10 + nb20Cents * 20 + nb50Cents * 50;

    // 3 possibilités d'affichage, donc => IF / ELSE IF / ELSE
    if (total < 100) {
      int manque = 100 - total;
      System.out.println("Il vous manque " + manque + " cents pour prendre un café.");
    } else if (total > 100) {
      int enTrop = total - 100;
      System.out.println("Il vous restera " + enTrop + " cents après avoir pris votre café !");
    } else {
      System.out.println("Vous avez exactement de quoi vous payer le café !");
    }
  }
}
