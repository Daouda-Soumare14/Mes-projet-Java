package bases.java;

public class Main
{
    public static void main(String[] args)
    {
        Voiture v = new Voiture();
        v.demarer();
        v.arreter();
        v.getTypeVehicule();
        System.out.println("------------------------");
        Camion c = new Camion();
        c.demarer();
        c.arreter();
        c.getTypeVehicule();
    }
}
