package bases;

public class ConvertirPrimitifEnPrimitif
{
    public static void main(String[] args)
    {
        // convertir un int en double
        int age = 23;
        double ageDouble = (double) age;
        System.out.println("Int converti en double "+ageDouble);

        // convertir un string en int
        String text = "33434";
        int valeur = Integer.parseInt(text);
        System.out.println("String converti en int "+valeur);

        // convertir un double en string
        double pi = 3.14;
        String piString = String.valueOf(pi);
        System.out.println("Double converti en string " +piString);
    }
}
