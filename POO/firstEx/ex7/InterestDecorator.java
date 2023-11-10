// Concrete decorator for interest calculation
class InterestDecorator extends DebtDecorator {
    private double interestRate;

    public InterestDecorator(Debt debt, double interestRate) {
        super(debt);
        this.interestRate = interestRate;
    }

    public double calculate() {
        return wrappedDebt.calculate() * (1 + interestRate);
    }
}