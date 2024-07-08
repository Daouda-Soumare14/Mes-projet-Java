package ExoApplication;

public interface Transaction
{
    public void transfertCompte(Compte compteDestinataire, double montant);
    public void transfertOrangeMoney(int numTelephone, double montant);
}
