package poo.exo6;

public class Camion extends Vehicule implements VehiculeMotoris
{

    @Override
    public void demarrer() {
        System.out.println("le camion demarre");
    }

    @Override
    public void arreter() {
        System.out.println("la camion s'arrete");
    }

    @Override
    public void getTypeVehicule() {
        System.out.println("le camion est de type blindé");
    }
}
