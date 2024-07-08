package poo.ExoApplication;

import java.util.HashMap;
import java.util.Map;

public class CompteSimple extends Compte implements Transaction
{
    // le map permet de faire des associations entre les numeros de telephone et les comptes
    private Map<Integer, Compte> numeroOrangeMoney;

    public CompteSimple(String numcompte, double solde) {
        super(numcompte, solde);
        numeroOrangeMoney = new HashMap<>();
    }

    // methode pour associer les nums de telephone au compte
    public void associerCompteOrangeMoney(int numTelephone, Compte compte){
        numeroOrangeMoney.put(numTelephone, compte);
    }

    @Override
    public void retirer(double montant) {
        if (montant > 0 && montant <= getSolde()){
            setSolde((getSolde() - montant));
            System.out.println("le montant "+ montant +" Fcfa a été retiré avec succes. "+ "nouveau solde : "+ getSolde());
        }else {
            System.out.println("impossible de retirer un montant. solde insuffisant.");
        }
    }

    @Override
    public void transfertCompte(Compte compteDestinataire, double montant) {
        if (getSolde() > montant){
            retirer(montant);
            compteDestinataire.deposer(montant);
            System.out.println("le transfert de : "+ montant + " Fcfa effectuer avec succes au compte : "+ compteDestinataire.getNumcompte());
        }else {
            System.out.println("Erreur, solde insuffisant pour effectuer le transfert.");
        }
    }

    @Override
    public void transfertOrangeMoney(int numeroTelephone, double montant) {
        // on divise le numero de telephone par 10000000 et on conserve les deux premiers valeur puis on les compares avec 77 ou 78
        if (String.valueOf(numeroTelephone).length() == 9 && (numeroTelephone / 10000000 == 77) || (numeroTelephone / 10000000 == 78)){
            // on recupere le compte associé au numero de telephone
            Compte compte = numeroOrangeMoney.get(numeroTelephone);
            if (compte != null){
                double montantAvecFrais = montant * (5/100);
                compte.retirer(montantAvecFrais);
                System.out.println("le transfert de "+ montant + " Fcfa effectuer avec succes."+ " frais de transfert de 5%.");
            }else {
                System.out.println("Erreur, aucun compte associé au numero de telephone.");
            }
        }else {
            System.out.println("Erreur, le numero de telephone invalide pour orange nomey.");
        }
    }
}
