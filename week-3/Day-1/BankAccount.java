 class Bank{
    int accountNumber;
    String accountHolder;
    int balance;

    void DisplayDetails(){
        System.out.println("====Account Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);

    }
}
public class BankAccount{
    public static void main(String[] args){
        Bank sc = new Bank();
        sc.accountNumber = 123456789;
        sc.accountHolder = "Karthik";
        sc.balance = 50000;

        sc.DisplayDetails();
    }
}
