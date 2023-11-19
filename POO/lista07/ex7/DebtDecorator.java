// Base decorator
abstract class DebtDecorator extends Debt {
    protected Debt wrappedDebt;

    public DebtDecorator(Debt debt) {
        super(debt.amount);
        this.wrappedDebt = debt;
    }

    public abstract double calculate();
}