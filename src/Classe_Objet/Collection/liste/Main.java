package Classe_Objet.Collection.liste;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Listes maListe1 = new Listes("Prié le matin");
        Listes maListe2 = new Listes("Allé a l'ecole");

        List<Listes> malistecomplete = new ArrayList<>();
        malistecomplete.add(maListe1);
        malistecomplete.add(maListe2);

        // premiere forme de parcour
        for (int i = 0; i < malistecomplete.size(); i++) {
            Listes maliste = malistecomplete.get(i);
            System.out.println("contenu de l'element " + i + " : " + maliste.getListe());
        }
        // deuxieme forme de parcour
        for (Listes autreFormeParcour : malistecomplete) {
            System.out.println("contenu de l'element " + autreFormeParcour.getListe());
        }

        Listes m = malistecomplete.get(1);
        System.out.println(m.getListe());


    }
}
