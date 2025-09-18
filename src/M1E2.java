import java.util.Scanner;

public class M1E2 {
  public static void main(String[] args) {
    // Récupérer les heures, minutes, secondes de l'utilisateur
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez les heures :");
    int heures = clavier.nextInt();
    System.out.print("Entrez les minutes :");
    int minutes = clavier.nextInt();
    System.out.print("Entrez les secondes :");
    int secondes = clavier.nextInt();
    clavier.close();

    // Afficher l'heure statique
    System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");

    // Afficher le nombre de secondes écoulées depuis minuit
    int nbSecondesDepuisMinuit = (heures * 60 * 60) + (minutes * 60) + (secondes);

    System.out.println("Il s'est écoulé " + nbSecondesDepuisMinuit + " secondes depuis minuit.");
  }
}
