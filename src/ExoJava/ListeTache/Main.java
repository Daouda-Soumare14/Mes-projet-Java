package ExoJava.ListeTache;

public class Main
{
    public static void main(String[] args)
    {
        Tache tache1 = new Tache("supprimer", "la suppression est primordiale", true);
        Tache tache2 = new Tache("modifier", "la modification est primordiale", false);
        Tache tache3 = new Tache("ajouter", "l'ajout est primordiale", true);
        ListeTache laListeDeMesTaches = new ListeTache();
        laListeDeMesTaches.ajouteTache(tache1);
        laListeDeMesTaches.ajouteTache(tache2);
        laListeDeMesTaches.ajouteTache(tache3);
        laListeDeMesTaches.afficherTachesAfaire();

        laListeDeMesTaches.marquerTacheCommeTermine(1, true);
        laListeDeMesTaches.afficherTaches();
    }
}
