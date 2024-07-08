package poo_serie3.exo3;

import java.util.Scanner;

public class TableauDeNEntier
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("saisir la valeur de N : ");
        int N = scan.nextInt();

        int[] tab = new int[N];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("saisir la valeur "+ (i + 1)+ " : ");
            tab[i] = scan.nextInt();
        }

        int max = tab[0];
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max){
                max = tab[i];
            } else {
                min = tab[i];
            }
        }
        System.out.println("la valeur max du tableau : " + max);
        System.out.println("la valeur min du tableau : " + min);

        int somme = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0){
                somme += tab[i];
            }
        }
        System.out.println("la somme des valeurs pairs du tableau : " + somme);

        int cpt = 0;

        for (int i = 0; i < tab.length; i++) {
            if(min == tab[i]){
                cpt++;
            }
        }
        System.out.println("le nombre d'occurence de la valeur min du tableau : " +cpt);
    }
}
