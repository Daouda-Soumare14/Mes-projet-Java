package ExoJava.testBiblio;

public class Biblio 
{
    public Liv[] livres;
    public int nombreDeLivres;

    public Biblio(int tailleMax){
        livres = new Liv[tailleMax];
        nombreDeLivres = 0;
    }

    public void ajouterLivre(Liv liv){
        if (nombreDeLivres < livres.length) {
            nombreDeLivres++;
            System.out.println("le livre : "+ liv.getTitle()+ " a été ajouter avec success dans la biblio");
        }else{
            System.out.println("la biblio est pleine!!!");
        }
    }

    public void emprunterLivre(String title){
        boolean livreTrouve = false;
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getTitle().equals(title) && !livres[i].isDispo()) {
                livres[i].dispo = false;
                System.out.println("le livre "+title + " a été emprunter");
                livreTrouve = true;
                break;
            }
        }
        if (!livreTrouve) {
            System.out.println("le livre "+title+ " n'est pas dispo pour l'emprunt");
        }
    }

    public void retournerLivre(String title){
        boolean livreTrouve = false;
        for (int i = 0; i < nombreDeLivres; i++) {
            if (livres[i].getTitle().equals(title) && !livres[i].isDispo()) {
                livres[i].dispo = true;
                System.out.println("le livre "+title + " a été returner");
                livreTrouve = true;
                break;
            }
        }
        if (!livreTrouve) {
            System.out.println("le livre "+title+ " n'a pas été trouver ou est dispo");
        }
    }

    public void afficherLivreDisponible(){
        for (int i = 0; i < nombreDeLivres; i++) {
            if (livres[i].dispo) {
                System.out.println("-"+ livres[i].getTitle()+ " par "+ livres[i].getAuteur());
            }
        }
    }
}
