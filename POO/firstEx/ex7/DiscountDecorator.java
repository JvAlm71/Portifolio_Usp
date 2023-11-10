// Concrete decorator for interest with discount
class DiscountDecorator extends DebtDecorator {
    private double discountRate;

    public DiscountDecorator(Debt debt, double discountRate) {
        super(debt);
        this.discountRate = discountRate;
    }

    public double calculate() {
        return wrappedDebt.calculate() * (1 - discountRate);
    }
}