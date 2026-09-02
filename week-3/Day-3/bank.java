class bankaccount{
    private int accountNumber;
    private String holderName;
    private double balance;

    bankaccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

     public int getHolderNumber(){
            return this.accountNumber;
        }
    public String getholderName(){
        return this.holderName;
    }    
    public double getholderBalance(){
        return this.balance;
    }


    public void setHolderName(String holderName){
        if (holderName != null && !holderName.isEmpty()){
            this.holderName = holderName;
        }
        else{
            System.out.println("Invalid holder name");
        }
    }

     public void setholderBalance(double balance) {
        if (balance >= 0) { 
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative!");
        }    
    }
}


public class bank{
    public static void main(String[] args){
        bankaccount account1 = new bankaccount(101,"karthik",5000);
        System.out.println("old name: " + account1.getholderName());
        System.out.println("old balance:" + account1.getholderBalance());
        account1.setholderBalance(70000.0);
        System.out.println("new Balance: " + account1.getholderBalance());
        account1.setHolderName("karthik kumar Reddy");
        System.out.println("new name: " + account1.getholderName());

    }
}