package bases.java;

import java.util.Scanner;

public class tableax
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] tab = new int[5];

        for (int i = 0; i < tab.length ; i++) {
            System.out.println("saisir la valeur "+ (i+1) + " tableau : ");
            tab[i] = scan.nextInt();
        }

        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        System.out.println("la somme de tous les elements du tableau : "+ somme);
    }
}
