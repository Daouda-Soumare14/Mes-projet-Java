package ExoJava.ListeTache;

import java.util.ArrayList;
import java.util.List;

public class ListeTache
{
    public List<Tache>listedestache;

    public ListeTache()
    {
        listedestache = new ArrayList<>();
    }

    public void ajouteTache(Tache tache)
    {
        listedestache.add(tache);
    }

    public void marquerTacheCommeTermine(int i, boolean termine) {
        if (i >= 0 && i < listedestache.size()) {
            Tache tache = listedestache.get(i);
            tache.setTachetermine(termine);
            System.out.println("Tâche " + tache.getTitre() + " marquée comme terminée.");
        } else {
            System.out.println("Indice de tâche invalide.");
        }
    }

    public void afficherTachesAfaire() {
        System.out.println("Liste des tâches à faire :");
        for (int i = 0; i < listedestache.size(); i++) {
            Tache tache = listedestache.get(i);
            if (!tache.getIsTachetermine()) {
                System.out.println("Tâche " + (i + 1) + ": " + tache.getTitre());
                System.out.println("Description : " + tache.getDescription());
            }
        }
    }

    public void afficherTaches()
    {
        for (int i = 0; i < listedestache.size(); i++) {
            Tache tache = listedestache.get(i);
            System.out.println("Tache :" + (i+1)+ " " + tache.getTitre());
            System.out.println("Description :" + tache.getDescription());
            if (tache.getIsTachetermine()){
                System.out.println("Statut "+ " terminé");
            }else{
                System.out.println("Statut "+ " non terminé");
            }
        }
    }
}
