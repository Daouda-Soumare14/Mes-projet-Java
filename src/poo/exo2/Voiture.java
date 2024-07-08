package poo.exo2;

public class Voiture
{
    public String marque;
    public String modele;
    public int annee;

    public Voiture(String marque, String modele, int annee)
    {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    public Voiture(String marque, String modele)
    {
        this.marque = marque;
        this.modele = modele;
    }
}
