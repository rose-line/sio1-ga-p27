import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    // Récupérer le nombre d’heures travaillées

    // Initialisation du Scanner pour le clavier
    Scanner clavier = new Scanner(System.in);
    // nextInt attend une entrée au clavier
    System.out.print("Entrez le nombre d'heures travaillées : ");
    int heuresTravaillees = clavier.nextInt();

    // Récupérer le taux horaire
    System.out.print("Entrez le taux horaire : ");
    double tauxHoraire = clavier.nextDouble();

    // On "ferme" la ressource clavier
    clavier.close();

    // Multiplier le nombre d’heures par le taux horaire
    double salaireBrut = heuresTravaillees * tauxHoraire;

    // Afficher le résultat
    System.out.println("Le salaire brut est de : " + salaireBrut);
  }
}
