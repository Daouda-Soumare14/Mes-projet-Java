package poo.ExoApplication;

public abstract class Compte
{
    private String numcompte;
    private double solde;

    public Compte(String numcompte, double solde) {
        this.numcompte = numcompte;
        this.solde = solde;
    }

    public void deposer(double montant){
        if (montant > 0){
            this.solde += montant;
            System.out.println("le solde actuelle apres depos : "+ getSolde());
        }else {
            System.out.println("on ne peut pas deposer un montant inferieur ou egale a 0.");
        }
    }

    public abstract void retirer(double montant);

    public String getNumcompte() {
        return numcompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
