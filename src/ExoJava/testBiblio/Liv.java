package ExoJava.testBiblio;


public class Liv
{
    private String title;
    private String auteur;
    private int anneePub;
    public boolean dispo;


    public Liv(String title, String auteur, int anneePub, boolean dispo) {
        this.title = title;
        this.auteur = auteur;
        this.anneePub = anneePub;
        this.dispo = dispo;
    }
    

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnneePub() {
        return this.anneePub;
    }

    public void setAnneePub(int anneePub) {
        this.anneePub = anneePub;
    }

    public boolean isDispo() {
        return this.dispo;
    }

    public boolean getDispo() {
        return this.dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

}
