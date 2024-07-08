package DEV_01_SECOND_JAVA_DAOUDA_SOUMARE_L2GL.exo2;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
            int choix;

            do
            {
                System.out.println("------CALCULATRICE AVANCE---------");
                System.out.println("1- Addition");
                System.out.println("2- Multiplication");
                System.out.println("3- Soustraction");
                System.out.println("4- Division");
                System.out.println("5- Racine Carre");
                System.out.println("6- Logarithme");
                System.out.println("7- Puissance");
                System.out.println("8- Quitter!!!!");

                System.out.println("saisir votre choix : ");
                choix = scan.nextInt();
                
                if (choix >= 1 && choix <= 7) {
                    System.out.println("saisir le nombre 1 : ");
                    double nombre1 = scan.nextDouble();
                    
                    System.out.println("saisir le nombre 2 : ");
                    double nombre2 = scan.nextDouble();

                    switch (choix) {
                        case 1:
                                Addition addition = new Addition();
                                System.out.println("la somme = "+ addition.calculer(nombre1, nombre2));
                            break;
                        case 2:
                                Multiplication multiplication = new Multiplication();
                                System.out.println("le produit = "+ multiplication.calculer(nombre1, nombre2));
                            break;
                        case 3:
                                Soustraction soustraction = new Soustraction();
                                System.out.println("la soustraction de = "+ soustraction.calculer(nombre1, nombre2));
                            break;
                        case 4:
                                Division division = new Division();
                                System.out.println("la division = "+ division.calculer(nombre1, nombre2));
                            break;
                        case 5:
                                RacineCarree racineCarree = new RacineCarree();
                                System.out.println("la racine carree = "+ racineCarree.calculer(nombre1, nombre2 = 0));
                            break;
                        case 6:
                                Locarithme locarithme = new Locarithme();
                                System.out.println("le logarithme = "+ locarithme.calculer(nombre1, nombre2 = 0));
                            break;
                        case 7:
                                Puissance puissance = new Puissance();
                                System.out.println("la puissance  = " + puissance.calculer(nombre1, nombre2));
                            break;
                    }
                }else if (choix == 8) {
                    System.out.println("Quitter !!!!");   
                }else{
                    System.out.println("veillez saisir un nombre compris entre 1 et 8");
                }
            }while(choix != 8);
        }
    }
    
}
