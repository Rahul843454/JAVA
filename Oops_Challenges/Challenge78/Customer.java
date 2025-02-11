package Challenge78;

public class Customer {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("001", "Sahil");
        account.depositMoney(5000);
        account.getBalance();
        account.withdrawMoney(166.5);
        account.getBalance();
    }
}