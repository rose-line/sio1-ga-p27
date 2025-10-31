package module3;

/*
 * Produire la sortie suivante :
 *
 * ``` 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 ... ```
 *
 * Les deux premiers nombres sont 0 et 1, ensuite chaque élément est la somme des deux précédents.
 *
 * (on pourra par exemple s'arrêter à 20 éléments après `0` et `1`)
 */
public class M3Suite2 {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    System.out.print(a + " " + b + " "); // On "amorce" la suite avec les deux premiers nombres

    for (int i = 3; i <= 20; i++) { // Puis on démarre la boucle à partir du 3e élément
      int c = a + b; // Calcul du nouvel élément à partir des deux précédents
      System.out.print(c + " "); // On n'oublie pas l'espace après chaque nombre
      a = b; // Mise à jour des nouveaux "précédents" pour le prochain tour
      b = c;
    }
  }
}
