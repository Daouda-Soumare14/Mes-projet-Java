package poo.exo3;


public class Main
{
    public static void main(String[] args)
    {
        Voiture v1 = new Voiture("Tesla", "RW400", 2022);

        v1.afficherInfoVoiture();

        Voiture v2 = new Voiture("BMW", "RW400", 2022);
        v2.setModele("QQQQQ");

        v2.afficherInfoVoiture();

        Voiture v3 = new Voiture("Range Rover", "RW400", 2022);

        v3.afficherInfoVoiture();
    }
}
