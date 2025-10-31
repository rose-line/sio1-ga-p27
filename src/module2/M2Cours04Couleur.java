package module2;

import java.util.Scanner;

public class M2Cours04Couleur {
  public static void main(String[] args) {
    // Récupérer la note
    System.out.print("Entrez votre note sur 20 : ");
    Scanner clavier = new Scanner(System.in);
    int note = clavier.nextInt();
    clavier.close();

    // Déclaration de la variable qui va retenir la couleur
    String couleur; // notez qu'on n'est pas obligé de lui donner une valeur immédiatement
    // Test : dans quelle fenêtre sonnes-nous ?
    // 1 SEULE de ces 4 branches va être exécutée
    if (note < 6) {
      couleur = "rouge";
    } else if (note < 11) {
      couleur = "jaune";
    } else if (note < 16) {
      couleur = "vert";
    } else { // si on arrive ici, la note est entre 16 et 20
      couleur = "vert+";
    }

    System.out.println("Votre couleur : " + couleur);
  }
}
