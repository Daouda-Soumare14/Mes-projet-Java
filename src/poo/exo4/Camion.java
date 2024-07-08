package poo.exo4;

public class Camion extends Voiture
{
    protected int capaciteCharge;

    public Camion(String marque, String modele, int annee, int capaciteCharge)
    {
        super(marque, modele, annee);
        this.capaciteCharge = capaciteCharge;
    }

    public int getCapaciteCharge() {return capaciteCharge;}

    public void afficherInfoVoitureCamion()
    {
        super.afficherInfoVoiture();
        System.out.println("Capacité Charge : "+ getCapaciteCharge());
    }
}
