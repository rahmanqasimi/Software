package Practice2;

public class BankTester {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        bank.setBankBalance(1000);

        bank.withdraw(1500);
    }
}
