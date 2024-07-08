package poo.exo5;

public class Main
{
    public static void main(String[] args)
    {
        Camion c1 = new Camion("Camion", "RW400", 2022, 5000);

        System.out.println("les infos bien detaillé");
        c1.afficherInfoVoitureCamion(true);

        System.out.println("les infos sans detaillé");
        c1.afficherInfoVoitureCamion( false);

        System.out.println("les infos du voiture");
        Voiture v1 = new Voiture("Tesla", "RW400", 2022);

        v1.afficherInfoVoiture();

    }
}
