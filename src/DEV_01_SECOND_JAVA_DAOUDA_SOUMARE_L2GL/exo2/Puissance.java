package DEV_01_SECOND_JAVA_DAOUDA_SOUMARE_L2GL.exo2;

public class Puissance implements Operation{

    @Override
    public double calculer(double a, double b) {
        return Math.pow(a, b);
    }
    
}
