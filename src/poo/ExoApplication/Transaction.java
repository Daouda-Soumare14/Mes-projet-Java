package poo.ExoApplication;

public interface Transaction
{
    public void transfertCompte(Compte compteDestinataire, double montant);
    public void transfertOrangeMoney(int numeroTelephone, double montant);
}
