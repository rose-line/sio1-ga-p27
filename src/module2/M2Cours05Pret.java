package module2;

import java.util.Scanner;

// Pour obtenir un prêt, on doit gagner plus de 30000 € par an
// et travailler depuis au moins deux ans
public class M2Cours05Pret {
  public static void main(String[] args) {
    // Récupérer le salaire annuel
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez votre salaire annuel : ");
    int salaire = clavier.nextInt();

    // Récupérer le nombre d'années d'emploi
    System.out.print("Entrez le nombre d'années d'emploi : ");
    int anneesEmploi = clavier.nextInt();
    clavier.close();

    // La condition du IF contient deux choses à évaluer
    // Les deux doivent être vraies pour que la condition soit vraie
    // L'opérateur logique ET (&& en Java) est utilisé
    if (salaire > 30000 && anneesEmploi >= 2) {
      System.out.println("Le prêt est accepté.");
    } else {
      System.out.println("Le prêt est refusé.");
    }
  }
}
