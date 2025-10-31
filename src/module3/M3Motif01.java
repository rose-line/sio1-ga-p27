package module3;

//
// Produire la sortie suivante en utilisant des boucles `for`.
//
// (indication : chaque ligne fait 40 caractères)
//
// ----------------------------------------
// _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
// 1122334455667788990011223344556677889900
// ----------------------------------------
//
public class M3Motif01 {
  public static void main(String[] args) {

    // Espacement avant le motif
    System.out.println(" ");
    System.out.println();

    // Première ligne de tirets
    for (int i = 1; i <= 40; i++) {
      System.out.print("-");
    }

    // Passage à la ligne
    System.out.println();

    // Ligne du motif _-^-
    for (int i = 1; i <= 10; i++) {
      System.out.print("_-^-");
    }

    // Passage à la ligne
    System.out.println();

    // Ligne des chiffres
    // Il y a deux fois la séquence 11223344556677889900
    // donc une boucle externe pour les deux fois
    for (int i = 1; i <= 2; i++) {
      // Puis une boucle interne pour afficher 11 22 33 ... 99
      for (int j = 1; j <= 9; j++) {
        System.out.print(j + "" + j); // les 2 chiffres, "" pour forcer la concaténation de strings
      }
      // le 00 final ne rentre pas bien dans la boucle, donc traitement à part
      System.out.print("00");
    }

    // Passage à la ligne
    System.out.println();

    // Dernière ligne de tirets
    for (int i = 1; i <= 40; i++) {
      System.out.print("-");
    }
  }
}
