package module3;

/*
 * Écrire une boucle `for` qui produit la sortie suivante :
 *
 * ``` -4 14 32 50 68 86 ```
 */
public class M3Suite1 {
  public static void main(String[] args) {

    // SOLUTION 1
    // On part de -4 et on avance de 18 en 18
    for (int i = -4; i <= 86; i += 18) {
      System.out.print(i + " ");
    }

    System.out.println();

    // SOLUTION 2 (comptage classique)
    // On compte normalement de 1 en 1 et on on utilise une variable supplémentaire
    // pour gérer le nombre à afficher
    int nombre = -4;
    for (int i = 1; i <= 6; i++) { // 6 affichages
      System.out.print(nombre + " ");
      nombre = nombre + 18;
    }
  }
}
