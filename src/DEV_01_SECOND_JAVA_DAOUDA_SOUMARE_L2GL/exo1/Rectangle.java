package DEV_01_SECOND_JAVA_DAOUDA_SOUMARE_L2GL.exo1;

public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public double calculerSurface() {
        return this.longueur * this.largeur;
    }

    public double calculerPerimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    public boolean estCarre() {
        if (this.longueur == this.largeur) {
            return true;
        }else{
            return false;
        }
    }
}
