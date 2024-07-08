package ExoApplication;

public class CompteSimple extends Compte implements Transaction
{
    public CompteSimple(String numcompte, double solde) {
        super(numcompte, solde);
    }

    @Override
    public void retirer(double montant) {
        if(getSolde() > montant){
            setSolde(getSolde() - montant);
            System.out.println("le solde actuelle apres retrait : "+ getSolde());
        }else {
            System.out.println("Erreur, impossible de retirer un montant inferieur ou egale a 0.");
        }
    }

    @Override
    public void transfertCompte(Compte compteDestinataire, double montant) {
        if (getSolde() >= montant){
            retirer(montant);
            compteDestinataire.deposer(montant);
            System.out.println("le montant " + montant + " a été deposer avec success, nouveau solde : "+ compteDestinataire.getSolde());
        }else {
            System.out.println("Erreur solde insuffisant");
        }
    }

    @Override
    public void transfertOrangeMoney(int numTelephone, double montant) {
        if (String.valueOf(numTelephone).length() == 9 && (numTelephone / 10000000 == 77) || (numTelephone / 10000000 == 78)){
            double montantAvecFrans = montant * 1.05;
            if (montantAvecFrans <= getSolde()){
                retirer(montantAvecFrans);
                System.out.println("Transfert orange money de "+ montant + " effectuer avec un frais de 5%. nouveau solde : "+getSolde());
            }else {
                System.out.println("le solde est insuffisant pour effectuer le transfert avec frais.");
            }
        }else {
            System.out.println("Erreur, numero de telephone invalide par orange money.");
        }
    }
}
