package DEV_01_SECOND_JAVA_DAOUDA_SOUMARE_L2GL.exo1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("saisir la longueur du rectangle : ");
        double longueur = scan.nextDouble();

        System.out.println("saisir la largeur du rectangle : ");
        double largeur = scan.nextDouble();

        Rectangle rectangle = new Rectangle(longueur, largeur);

        System.out.println("Surface du rectangle : "+ rectangle.calculerSurface());
        System.out.println("Perimetre du rectangle : "+ rectangle.calculerPerimetre());
        System.out.println("Est ce que c'est un carree ? : "+ rectangle.estCarre());
    }
}
