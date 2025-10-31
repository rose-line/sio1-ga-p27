package module2;

import java.util.Scanner;

// V2 : quota atteint ou pas ? 2 traitements différents en fonction
// Seuls les affichages sont traités (la prime n'est pas ajoutée)
public class M2Cours02PrimeV2 {
  public static void main(String[] args) {
    // Initialisation des variables
    int quota = 10;

    // Récupérer le nombre de ventes
    System.out.print("Combien de ventes avez-vous conclues cette semaine ? ");
    Scanner clavier = new Scanner(System.in);
    int nbVentes = clavier.nextInt();
    clavier.close();

    // Test : félicitations ou rappel ?
    if (nbVentes >= quota) {
      System.out.println("Félicitations ! Vous avez rempli votre quota.");
    } else {
      int nbManquantes = quota - nbVentes;
      System.out.println("Il vous manque " + nbManquantes + " ventes pour atteindre le quota.");
    }
  }
}
