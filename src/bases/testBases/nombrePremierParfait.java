package bases.testBases;

import java.util.Map;
import java.util.Scanner;

public class nombrePremierParfait
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("saisir la valeur de N : ");
        int n = scan.nextInt();

        int cpt = 0;
        int som = 0;
        for (int i = 1; i <= n / 2 ; i++) {
            if (n % i == 0){
                cpt += 1;
                som += i;
            }
        }if (cpt == 1){
            System.out.println("le nombre "+ n +" est premier");
        }else {
            System.out.println("le nombre "+ n + " n'est pas premier");
        }
        if (som == n){
            System.out.println("le nombre "+ n + " est parfait");
        }else {
            System.out.println("le nombre "+ n + " n'est pas parfait");
        }

        int compteParfaits = 0;
        System.out.println("Les nombres premiers entre 1 et " + n + " sont :");
        for (int i = 2; i <= n; i++) {
            boolean estPremier = true;
            int sommeDiviseurs = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    estPremier = false;
                    sommeDiviseurs += j;
                    break;
                }
            }
            if (estPremier) {
                System.out.print(i + " ");
            }
            if (sommeDiviseurs == i){
                System.out.println(i + " ");
                compteParfaits++;
                if (compteParfaits == 2){
                    break;
                }
            }
        }
    }
}
