package Challenge78;

class BankAccount {
    @SuppressWarnings("unused")
    private String accountNumber;
    @SuppressWarnings("unused")
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }
    
    public void depositMoney(double money){
        if(money <= 0){
            System.out.println("Invalid Deposit");
        }else{
            balance += money;
        }
    }
    
    public void withdrawMoney(double money){
        if(money <= balance && money >=1){
            balance -= money;
            System.out.println("Withdraw of "+money+" is Successful"); 
        }else if(money > balance){
            System.out.println("Insufficent Balance in the Account");
        }else {
            System.out.println("Invalid Withdrawal");
        }
        
    }

    public void getBalance() {
        System.out.println("Available Amount: " + balance);
    }
}
