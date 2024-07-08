package poo_serie3.exo5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Personne
{
    private static final Random random = new Random();
    private static int conteurMatricule = 0;
    private String nom;
    private String prenom;
    private int age;
    private String matricule;
    private LocalDate dateNaissance;

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.matricule = generateurMatricule();
        this.age = calculAge();
    }

    public String generateurMatricule(){
        conteurMatricule++;
        String annee = String.format("%04d", dateNaissance.getYear());
        String mois = String.format("%02d", dateNaissance.getMonthValue());
        String jour = String.format("%02d", dateNaissance.getDayOfMonth());
        String randomId = String.format("%04d", random.nextInt(10));
        return annee + mois + jour + randomId;
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
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", matricule='" + matricule + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
