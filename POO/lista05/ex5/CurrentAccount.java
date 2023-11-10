class CurrentAccount {
    private double balance;
    private double overdraftLimit;

    public void withdraw(double value) throws IllegalArgumentException {
        if (value <= 0) {
            throw new IllegalArgumentException("the withdraw value need is positive");
        }
        if (value > balance + overdraftLimit) {
            throw new IllegalArgumentException("the withdraw value is bigger than the balance");
        }
        balance -= value;
    }   

    public void deposit(double value) throws IllegalArgumentException {
        if (value <= 0) {
            throw new IllegalArgumentException("the deposit value need is positive");
        }
        balance += value;
    }

    public void setoverdraftLimit(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("the overdraft limit need is positive");
        }
        overdraftLimit = value;
    }

    public double getBalance() {
        return balance;
    }
}
