package poo_serie3.exo6;

import java.util.Date;

public class LivreEmprunte extends Livre
{
    private Date dateDeRetourPrevu;

    public LivreEmprunte(String title, String author, int datePublication, int nombreDePages, Date dateEmprunt) {
        super(title, author, datePublication, nombreDePages);
        this.dateDeRetourPrevu = generateDateDeRetourPrevu(dateEmprunt);
    }

    public Date getDateDeRetourPrevu(){
        return dateDeRetourPrevu;
    }

    public Date generateDateDeRetourPrevu(Date dateEmprunt){
        long millisInDay = 24 * 60 * 60 * 1000;
        int joursMin = 7;
        int joursMax = 21;
        int joursAlleatoire = joursMin + (int)(Math.random() * (joursMax - joursMin) + 1);
        long dateRetour = dateEmprunt.getTime() + (joursAlleatoire * millisInDay);

        return new Date(dateRetour);
    }
}
