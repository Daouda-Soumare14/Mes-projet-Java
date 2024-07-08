package bases.java;

public class Camion extends Vehicule implements VehiculeMotorise
{
    @Override
    public void demarer() {
        System.out.println("le camion demarre");
    }

    @Override
    public void arreter() {
        System.out.println("le camion s'arrete");
    }

    @Override
    public void getTypeVehicule() {
        System.out.println("Camion Tesla");
    }
}
