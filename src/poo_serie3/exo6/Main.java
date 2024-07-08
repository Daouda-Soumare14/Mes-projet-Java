package poo_serie3.exo6;

import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Bibliotheque biblio = new Bibliotheque();

        Livre livre = new Livre("Petrol et Gaz au Senegal", "Ousmane Sonko", 2017, 300);
        Livre livre1 = new Livre("Vol de nuit", "Antoine de Saint Excupery", 2000, 500);
        LivreEmprunte livre2 = new LivreEmprunte("Introduction à la programmation", "Jean Dupont", 2020, 400, new Date());

        biblio.ajouterLivre(livre);
        biblio.ajouterLivre(livre1);
        biblio.ajouterLivre(livre2);

        biblio.afficherLivres();
        biblio.trieLivreParTitre();
        biblio.afficherLivres();
        biblio.supprimerLivre("VOLANT00");
        biblio.afficherLivres();
    }
}
