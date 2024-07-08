import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int choix;

            do {
                // Affichage du menu
                System.out.println("Menu :");
                System.out.println("1 - La somme");
                System.out.println("2 - Le produit");
                System.out.println("3 - La division");
                System.out.println("4 - Le modulo");
                System.out.println("5 - Quitter");
                System.out.print("Entrez votre choix : ");
                // Lecture du choix de l'utilisateur
                choix = scanner.nextInt();

                // Appel de la méthode appropriée en fonction du choix
                switch (choix) {
                    case 1:
                        faireSomme();
                        break;
                    case 2:
                        faireProduit();
                        break;
                    case 3:
                        faireDivision();
                        break;
                    case 4:
                        faireModulo();
                        break;
                    case 5:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 5.");
                }
            } while (choix != 5); // Répéter le menu jusqu'à ce que l'utilisateur choisisse de quitter
        }
    }

    public static void faireSomme() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier nombre : ");
            int nombre1 = scanner.nextInt();
            System.out.print("Entrez le deuxième nombre : ");
            int nombre2 = scanner.nextInt();
            int somme = nombre1 + nombre2;
            System.out.println("La somme est : " + somme);
        }
    }

    public static void faireProduit() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier nombre : ");
            int nombre1 = scanner.nextInt();
            System.out.print("Entrez le deuxième nombre : ");
            int nombre2 = scanner.nextInt();
            int produit = nombre1 * nombre2;
            System.out.println("Le produit est : " + produit);
        }
    }

    public static void faireDivision() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le dividende : ");
            int dividende = scanner.nextInt();
            System.out.print("Entrez le diviseur : ");
            int diviseur = scanner.nextInt();
            if (diviseur != 0) {
                int division = dividende / diviseur;
                System.out.println("La division est : " + division);
            } else {
                System.out.println("Division par zéro impossible.");
            }
        }
    }

    public static void faireModulo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier nombre : ");
            int nombre1 = scanner.nextInt();
            System.out.print("Entrez le deuxième nombre (modulo) : ");
            int nombre2 = scanner.nextInt();
            if (nombre2 != 0) {
                int modulo = nombre1 % nombre2;
                System.out.println("Le résultat du modulo est : " + modulo);
            } else {
                System.out.println("Modulo par zéro impossible.");
            }
        }
    }
}
