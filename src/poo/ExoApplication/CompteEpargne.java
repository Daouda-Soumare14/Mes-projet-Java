package poo.ExoApplication;

public class CompteEpargne extends Compte implements Transaction
{
    public CompteEpargne(String numcompte, int solde) {
        super(numcompte, solde);
    }

    @Override
    public void transfertCompte(Compte compteDestinataire, double montant) {

    }

    @Override
    public void transfertOrangeMoney(int numeroTelephone, double montant) {

    }

    @Override
    public void retirer(double montant) {

    }
}
