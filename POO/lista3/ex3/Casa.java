public class Casa extends Predio{

    public Casa(double coeficienteCarbono){
        super(coeficienteCarbono);
    }

    public double coeficienteCarbono = 5.0;

    public double getCarbonoProduzido() {
        return 3 * coeficienteCarbono;
    }
}
