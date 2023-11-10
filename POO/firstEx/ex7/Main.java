public class Main {
    public static void main(String[] args) {
        Debt debt = new Debt(1000); // Initial debt
        debt = new InterestDecorator(debt, 0.05); // Adding 5% interest
        debt = new DiscountDecorator(debt, 0.02); // Applying 2% discount
        debt = new FeeDecorator(debt, 50); // Adding a fee of $50

        System.out.println("Final debt amount: " + debt.calculate());
    }
}