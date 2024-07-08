package poo_serie3.exo4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Personne
{
    private static int conterMatricule = 0;
    private String nom;
    private String prenom;
    private String matricule;
    private int age;
    private LocalDate dateNaissance;

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.matricule = generateurMatricule();
        this.age = calculAge();
    }

    public String generateurMatricule(){
        conterMatricule++;
        String premierLettrePrenomNom = prenom.substring(0, 1).toUpperCase() + nom.substring(0, 1).toUpperCase();
        String identifiant = String.format("%04d", conterMatricule % 10);
        return premierLettrePrenomNom + identifiant;
    }

    public int calculAge(){
        LocalDate dateActuelle = LocalDate.now();
        if (dateNaissance != null && !dateNaissance.isAfter(dateActuelle)){
            return Period.between(dateNaissance, dateActuelle).getYears();
        }else {
            throw new IllegalArgumentException("la date de naissance est invalide.");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return age == personne.age && Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom) && Objects.equals(matricule, personne.matricule) && Objects.equals(dateNaissance, personne.dateNaissance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, matricule, age, dateNaissance);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", age=" + age +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
