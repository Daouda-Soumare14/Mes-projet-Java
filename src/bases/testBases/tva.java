package bases.testBases;

import java.util.Scanner;

public class tva
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double tva = 0.18;

        System.out.println("saisir le prix unitaire : ");
        double prixUnitaire = scan.nextDouble();

        System.out.println("saisir la quantite : ");
        double quantite = scan.nextDouble();

        double montantHT = prixUnitaire * quantite;
        System.out.println("le montant hors taxe : " + montantHT);

        double montantTTC = 1 + (montantHT * tva);
        System.out.println("le montant tout taxe compris : " + montantTTC);

    }
}
