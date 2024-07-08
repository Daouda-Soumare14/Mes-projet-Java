package bases;

import java.util.Arrays;
import java.util.Scanner;

public class TestValeur
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // les deux valeurs entiere
        System.out.println("saisir l'entier 1 :");
        int entier1 = scanner.nextInt();

        System.out.println("saisir l'entier 2 :");
        int entier2 = scanner.nextInt();

        // les deux valeurs reels
        System.out.println("saisir le reel 1 :");
        double reel1 = scanner.nextDouble();

        System.out.println("saisir le reel 2 :");
        double reel2 = scanner.nextDouble();

        // determination de la valeur la plus petite
        int minEntier = Math.min(entier1, entier2);
        double minDouble = Math.min(reel1, reel2);

        // determination de la valeur la plus grande
        int maxEntier = Math.max(entier1, entier2);
        double maxDouble = Math.max(reel1, reel2);

        // creation d'un tableau trié
        double[] valeurs = {entier1, entier2, reel1, reel2};
        Arrays.sort(valeurs);

        // affichage des resultat
        System.out.println("la valeur la plus petite " + Math.min(minEntier, minDouble));
        System.out.println("la valeur la plus grande " + Math.max(maxEntier, maxDouble));

        System.out.println("les deux valeur des plus grande "+valeurs[2] +" et " + valeurs[3]);
        System.out.println("les deux valeur des plus petite "+valeurs[0] +" et " + valeurs[1]);
        System.out.println("les deux valeur intermedaire "+valeurs[1] +" et " + valeurs[2]);

        scanner.close();
    }
}
