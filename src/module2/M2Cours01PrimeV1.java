package module2;

import java.util.Scanner;

// V1 : La prime est ajoutée au salaire seulement si le quota de ventes est atteint
public class M2Cours01PrimeV1 {
  public static void main(String[] args) {
    // Initialisation des variables
    int salaire = 400;
    int prime = 250;
    int quota = 10;

    // Récupérer le nombre de ventes
    System.out.print("Combien de ventes avez-vous conclues cette semaine ? ");
    Scanner clavier = new Scanner(System.in);
    int nbVentes = clavier.nextInt();
    clavier.close();

    // Test : prime ou pas ?
    if (nbVentes >= quota) { // La condition est Vraie ou Fausse
      salaire = salaire + prime; // Si elle est Vraie, on ajoute la prime au salaire
    }

    // Affichage du salaire final
    System.out.println("Votre salaire est de : " + salaire + " €");
  }
}
