package ExoApplication;

public class ComptePayant extends Compte
{
    private double fraisTransaction;

    public ComptePayant(String numcompte, double solde, double fraisTransaction) {
        super(numcompte, solde);
        this.fraisTransaction = fraisTransaction;
    }

    @Override
    public void retirer(double montant) {
        if (getSolde() >= montant){
            setSolde(getSolde() - (montant + fraisTransaction));
            System.out.println("Retrait de " + montant + " avec frais de " + fraisTransaction + " effectué. Nouveau solde : " + getSolde());
        }else {
            System.out.println("Erreur, impossible de retirer un montant inferieur ou egale a 0.");
        }
    }

    public void deposer(double montant) {
        if (getSolde() > 0){
            setSolde(getSolde() + (montant - fraisTransaction));
            System.out.println("Dépôt de " + montant + " après déduction des frais de " + fraisTransaction + " effectué. Nouveau solde : " + getSolde());
        }else {
            System.out.println("Le montant de dépôt doit être positif.");
        }
    }
}
