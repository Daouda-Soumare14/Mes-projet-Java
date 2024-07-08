package bases.testBases;

import java.util.Scanner;

public class menuCalculate
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int choix;
        do
        {
            System.out.println("-------Menu calculate---------");
            System.out.println("1- Addition");
            System.out.println("2- Produit");
            System.out.println("3- Division");
            System.out.println("4- Modulo");
            System.out.println("5- Quitter");

            System.out.println("saisir votre choix : ");
            choix = scan.nextInt();

            if (choix >= 1 && choix <= 4) {
                System.out.println("saisir nombre 1 : ");
                int nombre1 = scan.nextInt();

                System.out.println("saisir nombre2 : ");
                int nombre2 = scan.nextInt();

                switch (choix) {
                    case 1:
                        System.out.println("la somme de " + nombre1 + " + " + nombre2 + " = "+ addition(nombre1, nombre2));
                        break;
                    case 2:
                        System.out.println("le produit de "+ nombre1+ " * "+ nombre2+ " = "+ produit(nombre1, nombre2));
                        break;
                    case 3:
                        if (nombre2 != 0){
                            System.out.println("la division de "+ nombre1+ " / "+ nombre2+ " = "+ division(nombre1, nombre2));
                        }else {
                            System.out.println("ZeroDivisionError");
                        }
                        break;
                    case 4:
                        if (nombre2 != 0){
                            System.out.println("le modulo de "+ nombre1+ " % "+ nombre2+ " = "+ modulo(nombre1, nombre2));
                        }else {
                            System.out.println("ZeroDivisionError");
                        }
                        break;
                }
            }else if (choix == 5){
                System.out.println("Quitter !!!!");
            }else {
                System.out.println("saisir un nombre compris entre 1 et 5.");
            }
        }while (choix > 5);
    }

    public static int addition(int a, int b)
    {
        return a + b;
    }

    public static int produit(int a, int b)
    {
        return a * b;
    }

    public static int division(int a, int b)
    {
        return a / b;
    }

    public static int modulo(int a, int b)
    {
        return a % b;
    }
}
