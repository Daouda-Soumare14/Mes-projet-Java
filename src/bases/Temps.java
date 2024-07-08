package bases;

public class Temps
{
    public static void main(String[] args)
    {
        boolean isSunny = false;
        boolean isWarm = false;
        boolean isCloudy = true;

        // Vérifiez si c'est un jour ensoleillé et chaud
        if (isSunny && isWarm) {
            System.out.println("C'est un jour ensoleillé et chaud.");
        }
        // Vérifiez si c'est un jour nuageux
        else if (isCloudy) {
            System.out.println("C'est un jour nuageux.");
        }

        // Utilisez les opérateurs logiques pour déterminer si c'est un jour pluvieux
        else {
            System.out.println("C'est un jour pluvieux.");
        }
    }
}
