package module3;


// Produire la sortie suivante en utilisant des boucles `for`.
// *
// **
// ***
// ****
// *****
//
public class M3Motif03 {
  public static void main(String[] args) {

    // Espacement avant le motif
    System.out.println(" ");
    System.out.println();

    // La solution est similaire à la SOLUTION 2 du motif 2
    // mais le nombre d'étoiles par ligne change en fonction du numéro de la ligne
    for (int i = 1; i <= 5; i++) { // boucle externe pour les 5 lignes
      for (int j = 1; j <= i; j++) { // boucle interne : ligne 'i' => affiche 'i' étoiles
        System.out.print("*");
      }
      System.out.println(); // passage à la ligne après chaque ligne d'étoiles
    }
  }
}
