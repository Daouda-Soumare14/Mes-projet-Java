package poo_serie3.exo6;

public class Livre
{
    private String title;
    private String author;
    private int datePublication;
    private int nombreDePages;
    

    public Livre(String title, String author, int datePublication, int nombreDePages) {
        this.title = title.length() <= 50 ? title : title.substring(0, 50);
        this.author = author.length() <= 50 ? author : author.substring(0, 50);
        this.datePublication = datePublication;
        this.nombreDePages = (nombreDePages >= 1 && nombreDePages <= 10000) ? nombreDePages : 0;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getDatePublication(){
        return datePublication;
    }

    public int getNombreDePages(){
        return nombreDePages;
    }

    public String generateCodeUnique(){
        String code = title.substring(0, 3).toUpperCase() + 
                    author.substring(0, 3).toUpperCase() +
                    Integer.toString(datePublication).substring(2);
        return code;
    }
}
