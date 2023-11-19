public class Carro implements CarbonoProduz {
    
        public double coeficienteCarbono = 11.0;
    
        public double getCarbonoProduzido() {
            return 3 * coeficienteCarbono;
        }
}
