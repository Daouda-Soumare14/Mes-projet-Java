package poo.ExoApplication;

public class GestionBanque
{
    public static void main(String[] args)
    {
        CompteSimple compteSimple = new CompteSimple("11111DS", 10000);
        CompteSimple compteSimpleDestinataire = new CompteSimple("22222DS", 1000);
        CompteSimple compteSimpleDestinataireOrangeMoney = new CompteSimple("33333DS", 0);
        compteSimple.deposer(500);
        compteSimple.retirer(500);
        compteSimple.transfertCompte(compteSimpleDestinataire, 1000);
        compteSimple.associerCompteOrangeMoney(779944593, compteSimpleDestinataireOrangeMoney);
        compteSimple.transfertOrangeMoney(779944593, 3000);
    }
}
