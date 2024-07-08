package bases;

public class ConversionObjetPrimitif
{
    public static void main(String[] args)
    {
        // créer des objets a partir des types primitifs
        Integer intObject = 23;
        Double doubleObjet = 23.443;
        Boolean boolObjet = true;
        Character charObjet = 'A';

        System.out.println(intObject);
        System.out.println(doubleObjet);
        System.out.println(boolObjet);
        System.out.println(charObjet);

        // conversion des objets en type primitif
        int intPrimitif = intObject;
        double doublePrimitif = doubleObjet;
        boolean boolPrimitif = boolObjet;
        char charPrimitif = charObjet;

        System.out.println(intPrimitif);
        System.out.println(doublePrimitif);
        System.out.println(boolPrimitif);
        System.out.println(charPrimitif);

        // conversion de type primitif en objet
        Integer intObject2 = intPrimitif;
        Double doubleObject2 = doublePrimitif;
        Boolean boolObject2 = boolPrimitif;
        Character charObject2 = charPrimitif;

        System.out.println(intObject2);
        System.out.println(doubleObject2);
        System.out.println(boolObject2);
        System.out.println(charObject2);

    }
}
