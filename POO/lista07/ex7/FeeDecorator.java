// Concrete decorator for interest with discount and additional fee
class FeeDecorator extends DebtDecorator {
    private double fee;

    public FeeDecorator(Debt debt, double fee) {
        super(debt);
        this.fee = fee;
    }

    public double calculate() {
        return wrappedDebt.calculate() + fee;
    }
}