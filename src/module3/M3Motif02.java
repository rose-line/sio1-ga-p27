package module3;


// Produire la sortie suivante en utilisant des boucles `for`.
// *****
// *****
// *****
// *****
//
public class M3Motif02 {
  public static void main(String[] args) {
    // Espacement avant le motif
    System.out.println(" ");
    System.out.println();

    // SOLUTION 1
    // Boucle pour 4 lignes identiques
    for (int i = 1; i <= 4; i++) {
      System.out.println("*****");
    }

    // Séparation entre les deux solutions
    System.out.println();
    System.out.println("--------------------------------");
    System.out.println();

    // SOLUTION 2
    // On peut également utiliser une boucle imbriquée (boucle dans la boucle)
    // pour gérer l'affichage des étoiles dans chaque ligne
    for (int i = 1; i <= 4; i++) { // boucle externe pour les lignes (4 lignes)
      for (int j = 1; j <= 5; j++) { // boucle interne pour les 5 étoiles dans chaque ligne
        System.out.print("*"); // 'print' pour ne pas passer à la ligne
      }
      System.out.println(); // passage à la ligne après chaque ligne d'étoiles
    }

    // Le "Motif 3" va nous obliger à utiliser une boucle imbriquée
  }
}
