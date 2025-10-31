package module2;

import java.util.Scanner;

// V3 : même chose mais on a ici repris, de la V1,
// le traitement sur le salaire
public class M2Cours03PrimeV3 {
  public static void main(String[] args) {
    int salaire = 400;
    int prime = 250;
    int quota = 10;

    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez votre nombre de ventes : ");
    int nbVentes = clavier.nextInt();
    clavier.close();

    if (nbVentes >= quota) {
      System.out.println("Félicitations ! Vous avez rempli votre quota.");
      salaire = salaire + prime;
    } else {
      int nbVentesManquantes = quota - nbVentes;
      System.out.println("Il vous manque " + nbVentesManquantes + " ventes");
    }

    System.out.println("Votre salaire est de : " + salaire);
  }
}
