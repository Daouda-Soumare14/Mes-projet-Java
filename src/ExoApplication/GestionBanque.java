package ExoApplication;

public class GestionBanque
{
    public static void main(String[] args)
    {
        CompteSimple monCompteSimple = new CompteSimple("11111", 1000);
        CompteSimple monCompteSimple1 = new CompteSimple("22222", 0);
        CompteSimple monCompteSimple2 = new CompteSimple("33333", 10000);
        monCompteSimple.deposer(1000);
        monCompteSimple.retirer(500);
        monCompteSimple.transfertCompte(monCompteSimple1, 500);
        monCompteSimple2.transfertOrangeMoney(779944593, 500);
        System.out.println("------------------------------------------------------------------------------");
        CompteEpargne monCompteEpargne = new CompteEpargne("44444", 20000, 3.5);
        CompteEpargne monCompteEpargne2 = new CompteEpargne("55555", 0, 3.5);
        monCompteEpargne.deposer(100);
        monCompteEpargne.retirer(50);
        monCompteEpargne.transfertCompte(monCompteEpargne2, 10000);
        monCompteEpargne.transfertOrangeMoney(779944593, 3000);
        monCompteEpargne.calculerInteret();
        System.out.println("------------------------------------------------------------------------------");
        ComptePayant monComptePayant = new ComptePayant("66666", 30000, 15);
        monComptePayant.deposer(1000);
        monComptePayant.retirer(1000);
    }
}
