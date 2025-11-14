package module3;

public class M3Motif17 {

  public final static int TAILLE = 13;

  public static void main(String[] args) {
    dessinerLampe();
  }

  private static void dessinerLampe() {
    dessinerPointe();
    dessinerAbatjour();
    dessinerPointe();
    dessinerTige();
    dessinerVInverse();
  }

  private static void dessinerPointe() {
    for (int i = 0; i < TAILLE; i++) {
      afficherCaractères(' ', TAILLE * 3);
      System.out.println("||");
    }
  }

  private static void dessinerAbatjour() {
    dessinerVInverse();
    dessinerTrapeze();
  }

  private static void dessinerVInverse() {
    int nbEspacesAvant = TAILLE * 3 - 3;
    int nbDeuxPoints = 0;

    for (int i = 0; i < TAILLE; i++) {
      afficherCaractères(' ', nbEspacesAvant);
      System.out.print("__/");
      afficherCaractères(':', nbDeuxPoints);
      System.out.print("||");
      afficherCaractères(':', nbDeuxPoints);
      System.out.println("\\__");

      nbEspacesAvant -= 3;
      nbDeuxPoints += 3;
    }

    System.out.print("|");
    afficherCaractères('\"', TAILLE * 6);
    System.out.println("|");
  }

  private static void dessinerTrapeze() {
    int nbEspacesAvant = 0;
    int nbVInversé = TAILLE * 3 - 1;
    for (int i = 0; i < TAILLE; i++) {
      afficherCaractères(' ', nbEspacesAvant);
      System.out.print("\\_");
      for (int j = 0; j < nbVInversé; j++) {
        System.out.print("/\\");
      }
      System.out.println("_/");

      nbEspacesAvant += 2;
      nbVInversé -= 2;
    }
  }

  private static void dessinerTige() {
    for (int i = 0; i < TAILLE * 4; i++) {
      dessinerPartieTige();
    }
  }

  private static void dessinerPartieTige() {
    int nbPourcents = TAILLE / 2;
    afficherCaractères(' ', (TAILLE * 3) - nbPourcents - 1);
    System.out.print("|");
    afficherCaractères('%', nbPourcents);
    System.out.print("||");
    afficherCaractères('%', nbPourcents);
    System.out.println("|");
  }

  // Fonction utilitaire pour afficher un caractère plusieurs fois
  private static void afficherCaractères(char car, int nb) {
    for (int i = 0; i < nb; i++) {
      System.out.print(car);
    }
  }
}
