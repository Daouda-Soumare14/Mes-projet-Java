package ExoJava.biblio;

public class Bibliotheque
{
    Livre[] livres;
    int nombresdelivre;

    public Bibliotheque(int tailleMax)
    {
        livres = new Livre[tailleMax];
        nombresdelivre = 0;
    }

    public void ajouterLivre(Livre livre)
    {
        if(nombresdelivre < livres.length)
        {
            livres[nombresdelivre] = livre;
            nombresdelivre++;
            System.out.println("le livre : " + livre.titre + "a été ajouter avec succes dans la bibliotheque");
        }
        else
        {
            System.out.println("la bibliotheque est pleine");
        }
    }

    public void emprunterLivre(String titre)
    {
        boolean livretrouve = false;
        for (int i = 0; i < nombresdelivre; i++)
        {
            if (livres[i].titre.equals(titre) && !livres[i].dispo)
            {
                livres[i].dispo = false;
                System.out.println("le livre " + titre + " a été emprunté");
                livretrouve = true;
                break;
            }
        }
        if(!livretrouve)
        {
            System.out.println("le livre " + titre + " n'est pas disponible pour l'emprunt");
        }
    }

    public void retournerLivre(String titre)
    {
        boolean livretrouve = false;
        for(int i = 0; i < nombresdelivre; i++)
        {
            if (livres[i].titre.equals(titre) && !livres[i].dispo)
            {
                livres[i].dispo = true;
                System.out.println("le livre " + titre + " a été retourné.");
                livretrouve = true;
                break;
            }
        }
        if (!livretrouve)
        {
            System.out.println("le livre " + titre + " n'a pas été trouvé ou est deja disponible");
        }
    }

    public void afficherLivreDisponible()
    {
        for (int i = 0; i < nombresdelivre; i++)
        {
            if(livres[i].dispo)
            {
                System.out.println("- " + livres[i].titre + " par " + livres[i].auteur);
            }
        }
    }
}
