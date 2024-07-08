package bases.java;

public class Voiture extends Vehicule implements VehiculeMotorise
{
    @Override
    public void demarer() {
        System.out.println("la voiture demare");
    }

    @Override
    public void arreter() {
        System.out.println("la voiture s'arrete");
    }

    @Override
    public void getTypeVehicule() {
        System.out.println("voiture range rover");
    }
}
