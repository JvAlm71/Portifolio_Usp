public abstract class Predio implements CarbonoProduz{

    public double coeficienteCarbono;

    public Predio(double coeficienteCarbono){
        this.coeficienteCarbono = coeficienteCarbono;
    }

    public double getCarbonoProduzido() {
        return 3 * coeficienteCarbono;
    }
}
