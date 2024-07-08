package poo.exo6;

public class Main
{
    public static void main(String[] args)
    {
        Voiture maVoiture = new Voiture();
        maVoiture.demarrer();
        maVoiture.arreter();
        maVoiture.getTypeVehicule();

        Camion monCamion = new Camion();
        monCamion.demarrer();
        monCamion.arreter();
        monCamion.getTypeVehicule();

    }
}
