package bases;

import java.util.Scanner;

public class PrixUnitaireQuantite
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double TVA = 0.18;
        System.out.println("saisir le prix : ");
        int prix = scanner.nextInt();

        System.out.println("saisir la quantite : ");
        int qte = scanner.nextInt();

        // calcul du MHT
        int montant = prix * qte;
        System.out.println("le montant hors taxe = " + montant);

        // calcul du du montant TTC
        double montantTTC = montant * (1 + TVA);
        System.out.println("le montant TTC = " + montantTTC);
    }
}
