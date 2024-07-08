package poo.exo6;

public class Voiture extends Vehicule implements VehiculeMotoris
{

    @Override
    public void demarrer() {
        System.out.println("la voiture demarre");
    }

    @Override
    public void arreter() {
        System.out.println("la voiture s'arrete");
    }

    @Override
    public void getTypeVehicule() {
        System.out.println("la voiture est de type laisé");
    }
}
