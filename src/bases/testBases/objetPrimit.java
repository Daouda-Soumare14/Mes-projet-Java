package bases.testBases;

public class objetPrimit
{
    public static void main(String[] args)
    {
        Integer intObjet = 3;
        Double doubleObjet = 3.4;
        Boolean boolObjet = true;
        Character charObjet = 'A';

        System.out.println(intObjet);
        System.out.println(doubleObjet);
        System.out.println(boolObjet);
        System.out.println(charObjet);

        System.out.println("######################################");

        int intPrimitif = intObjet;
        double doublePrimitif = doubleObjet;
        boolean boolPrimitif = boolObjet;
        char charPrimitif = charObjet;

        System.out.println(intPrimitif);
        System.out.println(doublePrimitif);
        System.out.println(boolPrimitif);
        System.out.println(charPrimitif);

        System.out.println("######################################");

        int intObjet1 = intPrimitif;
        double doubleObjet1 = doublePrimitif;
        boolean boolObjet1 = boolPrimitif;
        char charObjet1 = charPrimitif;

        System.out.println(intObjet1);
        System.out.println(doubleObjet1);
        System.out.println(boolObjet1);
        System.out.println(charObjet1);

        System.out.println("######################################");
        int primitif = 34;
        Integer objet = Integer.valueOf(primitif);
        System.out.println(objet);
    }
}
