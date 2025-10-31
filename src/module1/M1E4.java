package module1;

public class M1E4 {
  public static void main(String[] args) {
    // Algorithme général : calculer le nombre de secondes écoulées entre les deux puis calculer le
    // pourcentage par rapport au secondes totales dans une journée

    // Définir heure de début et heure de fin (pas de Scanner ici, on donne "en dur")

    int heuresDebut = 12;
    int minutesDebut = 34;
    int secondesDebut = 56;

    int heuresFin = 15;
    int minutesFin = 27;
    int secondesFin = 12;

    // Calcul des secondes passées entre les deux
    // On calcule les secondes depuis minuit pour les deux et on soustrait
    int secondesDepuisMinuit1 = heuresDebut * 60 * 60 + minutesDebut * 60 + secondesDebut;
    int secondesDepuisMinuit2 = heuresFin * 60 * 60 + minutesFin * 60 + secondesFin;
    int secondesEntreLesDeux = secondesDepuisMinuit2 - secondesDepuisMinuit1;
    System.out.println("Secondes passées : " + secondesEntreLesDeux);

    // Calculer le pourcentage par rapport à une journée
    int secondesJournee = 60 * 60 * 24;
    double pourcentage = secondesEntreLesDeux * 100.0 / secondesJournee;
    System.out.println("Pourcentage par rapport à une journée : " + pourcentage);

    // Affichage un peu plus sophistiqué avec printf et non println
    // %.2f permet de formatter un flottant avec 2 chiffres après la virgule
    // %.2f va être remplacé par la valeur fournie après la virgule
    // Pas de concaténation donc avec cette version,
    // c'est une insertion de valeur à un endroit spécifié
    System.out.printf("Pourcentage bien formatté : %.2f", pourcentage);
  }
}
