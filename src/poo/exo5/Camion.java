package poo.exo5;

import poo.exo4.Voiture;

public class Camion extends Voiture
{
    protected int capaciteCharge;

    public Camion(String marque, String modele, int annee, int capaciteCharge)
    {
        super(marque, modele, annee);
        this.capaciteCharge = capaciteCharge;
    }

    public int getCapaciteCharge() {return capaciteCharge;}

    public void afficherInfoVoitureCamion(boolean detail)
    {
        if (detail){
            super.afficherInfoVoiture();
            System.out.println("Capacité Charge : "+ getCapaciteCharge());
        }
        else{
            System.out.println("Marque : " + getMarque()+ "; "+ "Model : "+ getModele());
        }
    }

}
