package ExoJava.biblio;

public class Livre
{
    public String titre;
    public String auteur;
    public int anneePub;
    public boolean dispo;

    public Livre(String titre, String auteur, int anneePub, boolean dispo)
    {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePub = anneePub;
        this.dispo = dispo;
    }
}
