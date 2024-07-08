package poo_serie3.exo1;

import java.util.Scanner;

public class Somme
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("saisir le nombre 1 : ");
        int nombre1 = scan.nextInt();

        System.out.println("saisir le nombre 2 : ");
        int nombre2 = scan.nextInt();

        int somme = nombre1 + nombre2;
        System.out.println("la somme = " + somme);
    }
}
