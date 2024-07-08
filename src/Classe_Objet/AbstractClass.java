package Classe_Objet;

public abstract class AbstractClass
{
    // une class abstraite est une classe qui va contenir au moin une methode abstraite
    // donc les classe qui herite de cette class abstraite ce doivent ecrire le corp de la methode

    public void demarer()
    {
        System.out.println("la voiture demarre");
    }

    public abstract void freiner(); // une methode abstraite est en quelque sorte une signature
}
