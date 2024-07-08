package poo.exo3;

public class Voiture
{
    private String marque;
    private String modele;
    private int annee;

    public Voiture(String marque, String modele, int annee)
    {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void afficherInfoVoiture()
    {
        System.out.println("la marque : "+ getMarque()+ "; "+ "le modele :"+ getModele()+ "; "+ "l'annee :"+ getAnnee());
    }
}
