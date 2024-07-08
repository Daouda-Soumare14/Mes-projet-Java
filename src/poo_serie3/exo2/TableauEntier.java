package poo_serie3.exo2;

import java.util.Scanner;

public class TableauEntier
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("saisir la valeur "+ (i + 1)+ " : ");
            tab[i] = scan.nextInt();
        }

        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        System.out.println("la somme des elements du tableau : " + somme);
    }
}
