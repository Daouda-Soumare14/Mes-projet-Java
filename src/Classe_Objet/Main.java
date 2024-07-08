package Classe_Objet;

public class Main {
    public static void main(String[] args)
    {
        Humain h = new Humain(23, "Daouda", "Soumare");

        System.out.println("l'age : " + h.age +"; " + " prenom : " + h.prenom + "; " + " nom : " + h.nom);



        // interface

        ClassHeriteInterface maClasse = new ClassHeriteInterface();

        maClasse.demarer();
        maClasse.freiner();
    }
}
