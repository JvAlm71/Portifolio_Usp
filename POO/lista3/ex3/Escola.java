public class Escola extends Predio{

    public Escola(double coeficienteCarbono){
        super(coeficienteCarbono);
    }

    public double coeficienteCarbono = 7.0;

    public double getCarbonoProduzido() {
        return 3 * coeficienteCarbono;
    }
}
