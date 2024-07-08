package bases.ba;

public class convertir
{
    public static void main(String[] args)
    {
        int age = 34;
        double ageDouble = age;
        System.out.println(age);
        System.out.println(ageDouble);

        String chiffre = "4555";
        int chiffreInt = Integer.valueOf(chiffre);
        System.out.println(chiffreInt);

        String d = "4433";
        double f = Double.valueOf(d);
        System.out.println(f);

        double pi = 3.14;
        String piif = "3.14";

        String piString = String.valueOf(pi);
        System.out.println(piString);
    }
}
