package bases.testBases;

public class convertionTypes
{
    public static void main(String[] args)
    {
        int age = 43;
        double doubleAge = age;
        System.out.println(age);
        System.out.println(doubleAge);

        String lettre = "23";
        int intLettre = Integer.parseInt(lettre);
        System.out.println(intLettre);

        double pi = 3.14159;
        String stringPi = String.valueOf(pi);
        System.out.println(stringPi);

    }
}
