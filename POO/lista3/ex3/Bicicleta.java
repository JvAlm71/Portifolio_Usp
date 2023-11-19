public class Bicicleta implements CarbonoProduz {
    
        public double coeficienteCarbono = 4.2;
    
        public double getCarbonoProduzido() {
            return 3 * coeficienteCarbono;
        }
}
