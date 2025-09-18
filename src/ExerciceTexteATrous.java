import java.util.Scanner;

public class ExerciceTexteATrous {
  public static void main(String[] args) {
    // 1. Récupération du premier nom commun

    Scanner clavier = new Scanner(System.in);
    // nextInt attend une entrée au clavier
    System.out.print("Entrez le premier nom commun : ");
    String nomCommun1 = clavier.next();
    // System.out.println(nomCommun1);

    // 2. Récupération du nombre

    System.out.print("Entrez un nombre : ");
    int nombre = clavier.nextInt();
    // System.out.println(nombre);

    // 3. Récupération du second nom commun

    System.out.print("Entrez un second nom commun : ");
    String nomCommun2 = clavier.next();
    // System.out.println(nomCommun2);

    // 4. Récupération de l'adjectif

    System.out.print("Entrez un adjectif : ");
    String adjectif = clavier.next();
    // System.out.println(adjectif);

    // 5. Affichage du résultat "Il était une fois un NOM1 qui avait NOMBRE NOM2. Cela le rendait
    // très ADJECTIF."
    System.out.println("Il était une fois un " + nomCommun1 + " qui avait " + nombre + " "
        + nomCommun2 + ". Cela le rendait très " + adjectif + ".");
    clavier.close();

  }
}
