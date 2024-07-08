package poo_serie3.exo4;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Personne p1 = new Personne("soumare", "daouda", LocalDate.of(2001, 9, 18));
        Personne p2 = new Personne("soumare", "hamidou", LocalDate.of(1998, 9, 18));
        Personne p3 = new Personne("soumare", "zakaria", LocalDate.of(1996, 9, 18));

        System.out.println("nom : "+ p1.getNom()+ ", prenom : "+p1.getPrenom()+ ", matricule : "+p1.getMatricule()+ ", age : "+p1.getAge()+ " ans");
        System.out.println("nom : "+ p2.getNom()+ ", prenom : "+p2.getPrenom()+ ", matricule : "+p2.getMatricule()+ ", age : "+p2.getAge()+ " ans");
        System.out.println("nom : "+ p3.getNom()+ ", prenom : "+p3.getPrenom()+ ", matricule : "+p3.getMatricule()+ ", age : "+p3.getAge()+ " ans");
        System.out.println(p1); // la methode toString
        System.out.println(p2); // la methode toString
        System.out.println(p3); // la methode toString
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
