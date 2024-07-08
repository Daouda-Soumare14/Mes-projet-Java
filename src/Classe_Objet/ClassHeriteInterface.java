package Classe_Objet;

public class ClassHeriteInterface implements Interface
{

    @Override
    public void freiner()
    {
        System.out.println("la voiture s'arrete !!!!");
    }

    @Override
    public void demarer()
    {
        System.out.println("la voiture demarre !!!!");
    }
}
