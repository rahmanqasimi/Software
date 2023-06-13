package Practice2;

public class BankAccount {
    int bankBalance;
    public void setBankBalance(int amount){
        bankBalance = amount;
    }

    public void withdraw(int amount){
        if(amount>bankBalance){
            throw new InsufficientBalance("Insufficient balance");
        }
        else {
            bankBalance = bankBalance - amount;
            System.out.println("Remaining = "+bankBalance);
        }

    }

}
