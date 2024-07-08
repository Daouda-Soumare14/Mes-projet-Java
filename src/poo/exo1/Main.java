package poo.exo1;

public class Main
{
    public static void main(String[] args)
    {
        Voiture v1 = new Voiture();
        v1.marque = "Tesla";
        v1.modele = "RW400";
        v1.annee = 2022;
        System.out.println("la marque : "+ v1.marque+ "; "+ "le modele :"+ v1.modele+ "; "+ "l'annee :"+ v1.annee);

        Voiture v2 = new Voiture();
        v2.marque = "BMW";
        v2.modele = "RW400";
        v2.annee = 2022;
        System.out.println("la marque : "+ v2.marque+ "; "+ "le modele :"+ v2.modele+ "; "+ "l'annee :"+ v2.annee);

        Voiture v3 = new Voiture();
        v3.marque = "Range Rover";
        v3.modele = "RW400";
        v3.annee = 2022;

        System.out.println("la marque : "+ v3.marque+ "; "+ "le modele :"+ v3.modele+ "; "+ "l'annee :"+ v3.annee);
    }
}
