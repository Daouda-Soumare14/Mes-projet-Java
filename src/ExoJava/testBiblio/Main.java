package ExoJava.testBiblio;

public class Main 
{
    public static void main(String[] args){
        Liv liv1 = new Liv("soumare", "daouda", 2024, true);
        Liv liv2 = new Liv("camara", "hamidou", 2024, true);
        Liv liv3 = new Liv("fofana", "ismail", 2024, true);

        Biblio biblio = new Biblio(3);
        biblio.ajouterLivre(liv1);
        biblio.ajouterLivre(liv2);
        biblio.ajouterLivre(liv3);

        biblio.emprunterLivre("soumare");
        biblio.afficherLivreDisponible();
    }
}
