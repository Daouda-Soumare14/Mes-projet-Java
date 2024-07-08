package bases.ba;

import java.util.Arrays;
import java.util.Scanner;

public class condition
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("saisir la valeur de N : ");
        int N = scan.nextInt();

        int[] tab = new int[N];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("la valeur "+ (i+1)+ " du tableau : ");
            tab[i] = scan.nextInt();
        }

        int max = tab[0];
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max){
                max = tab[i];
            }else {
                min = tab[i];
            }
        }
        System.out.println("la valeur max : "+max);
        System.out.println("la valeur min : "+min);

        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0){
                somme += tab[i];
            }
        }
        System.out.println("la somme de tous les nombres pares du tableau : "+somme);

        int cpt = 0;
        for (int i = 0; i < tab.length; i++) {
            if (min == tab[i]){
                cpt++;
            }
        }
        System.out.println("le nomrbe d'occurence de "+min+ " est : "+ cpt);
    }
}
