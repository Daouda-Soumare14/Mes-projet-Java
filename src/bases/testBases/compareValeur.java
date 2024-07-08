package bases.testBases;

import java.util.Arrays;
import java.util.Scanner;

public class compareValeur
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("saisir l'entier1 : ");
        int entier1 = scan.nextInt();

        System.out.println("saisir l'entier2 : ");
        int entier2 = scan.nextInt();

        System.out.println("saisir le reel1 : ");
        double reel1 = scan.nextDouble();

        System.out.println("saisir le reel2 : ");
        double reel2 = scan.nextDouble();

        double[] valeur = {entier1, entier2, reel1, reel2};
        Arrays.sort(valeur);

        System.out.println("la valeur la plus petite : " + valeur[0]);
        System.out.println("la valeur la plus grande : " + valeur[3]);
        System.out.println("les deux valeurs les plus grandes : " + valeur[2]+ " et "+ valeur[3]);
        System.out.println("les deux valeurs les plus petite : " + valeur[0]+ " et "+ valeur[1]);
        System.out.println("les deux valeurs intermediaire : " + valeur[1]+ " et "+ valeur[2]);

    }
}
