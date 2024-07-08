package Classe_Objet.Collection.Set;

import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        Set val1 = new Set(1, 1);

        java.util.Set<Set> maset = new HashSet<>();
        maset.add(val1);

        for (Set masetcomplet : maset)
        {
            System.out.println(masetcomplet.getValeur1());
            System.out.println(masetcomplet.getValeur2());
        }
    }
}
