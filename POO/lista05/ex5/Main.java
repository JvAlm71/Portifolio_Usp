public class Main {
    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount();
        try {
            account.setoverdraftLimit(1000);
            account.deposit(1500);
            account.withdraw(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
