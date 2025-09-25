import java.util.Random;
import java.util.Scanner;

public class M1E5 {

  // DEVINER LE NOMBRE
  // Version 1
  // Un seul essai du joueur
  // L'ordinateur répond "Vous étiez à XX de la bonne réponse."
  // Pas de gestion particulière du gain :
  // L'affichage sera juste "Vous étiez à 0 de la bonne réponse" si on a gagné
  public static void main(String[] args) {
    // Utilisation de Random pour générer un nombre aléatoire
    Random random = new Random();
    int nombreADeviner = random.nextInt(100) + 1; // +1 car Random.nextInt(100) génère un nombre
                                                  // entre 0 et 99

    // Proposition du joueur récupérée au clavier
    Scanner scanner = new Scanner(System.in);
    System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
    System.out.print("Entrez votre proposition (entre 1 et 100) : ");
    int propositionJoueur = scanner.nextInt();
    scanner.close();

    // Affichage des deux nombres
    System.out.println("Vous proposez : " + propositionJoueur);
    System.out.println("Le nombre auquel je pensais était : " + nombreADeviner);

    // Calcul de l'écart entre le nombre à deviner et la proposition du joueur
    // Utilisation de Math.abs (valeur absolue) pour avoir une valeur positive de l'écart,
    // même quand le nombre à deviner est plus petit que la proposition du joueur
    int ecart = Math.abs(nombreADeviner - propositionJoueur);

    // Affichag du résultat
    System.out.println("Vous étiez à " + ecart + " de la bonne réponse.");
  }
}
