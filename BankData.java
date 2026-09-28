class BankInfo2 {
    private int accountno;
    private int balance;

    public  BankInfo2(int accountno, int balance) {
        this.balance = balance;
        this.accountno = accountno;
    }
    void displayOpenBal(int balance) {
        System.out.println("opening balance :" + balance);
   }
    void deposit(int accountno, int amount) {
        if (this.accountno == accountno) {
            if (amount >= 0) {
                this.balance += amount;
                System.out.println("demposit amount is :" + amount);
                System.out.println("Blance after deposit :" + balance);
            } else {
                System.out.println("Invalid balnace");
            }
        }
    }
    void withdraw(int accountno, int amount){
        if(this.accountno == accountno) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw amount :" + amount);
                System.out.println("Balance :" + balance);
            } else {
                System.out.println("insufficent balance");
            }
        }
    }
}
public class BankData {
    public static void main(String[] args){
        BankInfo2 BD = new BankInfo2(2030405060,999);
        BD.displayOpenBal(999);
        BD.deposit(2030405060, 15000 );
        BD.withdraw(2030405060, 99);
    }
}
