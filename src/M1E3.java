import java.util.Scanner;

public class M1E3 {
  public static void main(String[] args) {
    // Récupérer les heures, minutes, secondes depuis l'utilisateur au clavier
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez les heures :");
    int heures = clavier.nextInt();
    System.out.print("Entrez les minutes :");
    int minutes = clavier.nextInt();
    System.out.print("Entrez les secondes :");
    int secondes = clavier.nextInt();
    clavier.close();

    // Calculer les secondes qui restent AVANT minuit
    int heuresRestantes = 24 - heures - 1; // -1 car on a déjà "entamée" l'heure dans laquelle on
                                           // est
    int minutesRestantes = 60 - minutes - 1;
    int secondesRestantes = 60 - secondes;
    int secsAvantMinuit = heuresRestantes * 60 * 60 + minutesRestantes * 60 + secondesRestantes;

    // Afficher le résultat
    System.out.println("Secondes avant minuit : " + secsAvantMinuit);

    // Solution plus simple : calculer nb secondes dans une journée et soustraire
    final int secondesDansUneJournee = 60 * 60 * 24;
    int secondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;
    int secondesAvantMinuit = secondesDansUneJournee - secondesDepuisMinuit;
    System.out.println("Secondes avant minuit : " + secondesAvantMinuit);
  }
}
