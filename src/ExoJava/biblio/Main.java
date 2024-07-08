package ExoJava.biblio;

public class Main
{
    public static void main(String[] args)
    {
        Livre livre = new Livre("Une si longue lettre", "Mariama ba", 2014, true);
        Livre livre1 = new Livre("Vol de nuit", "Entoine de saint exupery", 2010, false);
        Livre livre2 = new Livre("Les comptaplation", "Victor hugo", 2014, true);
        Livre livre3 = new Livre("L'enfant noir", "Ousmane simbele", 2005, true);
        Livre livre4 = new Livre("Nini la mulatresse", "Ousmane simbele", 2014, false);

        Bibliotheque biblio = new Bibliotheque(50);

        biblio.ajouterLivre(livre);
        biblio.ajouterLivre(livre1);
        biblio.ajouterLivre(livre2);
        biblio.ajouterLivre(livre3);
        biblio.ajouterLivre(livre4);

        System.out.println("les livres disponible ");
        biblio.afficherLivreDisponible();

        biblio.emprunterLivre("Vol de nuit");
        biblio.emprunterLivre("Nini la mulatresse");

        System.out.println("les livres disponible apres emprunt ");
        biblio.afficherLivreDisponible();

        biblio.retournerLivre(livre1.titre);

        System.out.println("les livres disponible apres retour ");
        biblio.afficherLivreDisponible();
    }
}
