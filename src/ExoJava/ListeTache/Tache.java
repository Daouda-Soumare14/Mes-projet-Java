package ExoJava.ListeTache;

public class Tache
{
    private String titre;
    private  String description;
    private boolean tachetermine;

    public Tache(String titre, String description, boolean tachetermine)
    {
        this.titre = titre;
        this.description = description;
        this.tachetermine = tachetermine;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsTachetermine() {
        return tachetermine;
    }

    public void setTachetermine(boolean tachetermine) {
        this.tachetermine = tachetermine;
    }
}
