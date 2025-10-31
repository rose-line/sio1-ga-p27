package module1;

public class M1E1 {
  public static void main(String[] args) {
    // Initialiser l'heure avec des variables
    int heures = 12;
    int minutes = 34;
    int secondes = 56;

    // Afficher l'heure (utilisation des variables, pas de recopie des valeurs "en dur")
    System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");

    // Calcul du nombre de secondes écoulées depuis minuit
    int nbSecondesDepuisMinuit = (heures * 60 * 60) + (minutes * 60) + (secondes);

    // Afficher le résultat
    System.out.println("Il s'est écoulé " + nbSecondesDepuisMinuit + " secondes depuis minuit.");
  }
}
