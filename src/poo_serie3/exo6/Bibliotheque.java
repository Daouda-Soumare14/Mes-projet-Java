package poo_serie3.exo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Bibliotheque
{
    private ArrayList<Livre> livres;
    
    public Bibliotheque(){
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre){
        livres.add(livre);
    }

    public void supprimerLivre(String id){
        livres.removeIf(l -> l.generateCodeUnique().equals(id));
    }

    public void trieLivreParTitre(){
        Collections.sort(livres, Comparator.comparing(Livre::getTitle));
    }

    public void afficherLivres() {
        for (Livre livre : livres) {
            System.out.println("Titre: " + livre.getTitle());
            System.out.println("Code: " + livre.generateCodeUnique());
            System.out.println("Auteur: " + livre.getAuthor());
            System.out.println("Date de publication: " + livre.getDatePublication());
            System.out.println("Nombre de pages: " + livre.getNombreDePages());
            System.out.println("------------------------------");
        }
    }
}
