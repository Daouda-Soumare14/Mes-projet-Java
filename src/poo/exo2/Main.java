package poo.exo2;

public class Main
{
    public static void main(String[] args)
    {
        Voiture v1 = new Voiture("Tesla", "RW400", 2022);

        System.out.println("la marque : "+ v1.marque+ "; "+ "le modele :"+ v1.modele+ "; "+ "l'annee :"+ v1.annee);

        Voiture v2 = new Voiture("BMW", "RW400", 2022);

        System.out.println("la marque : "+ v2.marque+ "; "+ "le modele :"+ v2.modele+ "; "+ "l'annee :"+ v2.annee);

        Voiture v3 = new Voiture("Range Rover", "RW400");

        System.out.println("la marque : "+ v3.marque+ "; "+ "le modele :"+ v3.modele);
    }
}
