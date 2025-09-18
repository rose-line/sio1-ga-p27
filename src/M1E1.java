public class M1E1 {
  public static void main(String[] args) {
    // Initialiser les variables
    int heures = 12;
    int minutes = 34;
    int secondes = 56;

    // Afficher l'heure statique
    System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");

    // Afficher le nombre de secondes écoulées depuis minuit
    int nbSecondesDepuisMinuit = (heures * 60 * 60) + (minutes * 60) + (secondes);



    System.out.println("Il s'est écoulé " + nbSecondesDepuisMinuit + " secondes depuis minuit.");


  }
}
