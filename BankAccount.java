public class BankAccount {
private String accountNumber;
private String accountHolderName;
private double balance;
public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
    this.accountNumber = accountHolderName;
    this.accountHolderName = accountHolderName;
    this.balance = initialBalance;
}
// Getters
public String getAccountNumber() {
    return accountNumber;
}
public String getAccountHolderName() {
    return accountHolderName;
}
public double getBalance() {
    return balance;
}
// Methods
public boolean deposit (double amount) {
    if(amount<=0) return false;
    balance+=amount;
    return true;
}
public boolean withdraw(double amount) {
    if(amount<=0 | amount>balance) return false;
    balance-=amount;
    return true;
}
public static void main(String[] args){
    BankAccount b1 = new BankAccount("123","John Doe",100.0);
    System.out.println(b1.deposit(50.0));
    BankAccount b2 = new BankAccount("123","John Doe",100.0);
    System.out.println(b2.withdraw(30.0));
    BankAccount b3 = new BankAccount("123","John Doe",100.0);
    System.out.println(b3.withdraw(120.0));
    BankAccount b4 = new BankAccount("123","John Doe",100.0);
    System.out.println(b4.deposit(-20.0));
    BankAccount b5 = new BankAccount("123","John Doe",100.0);
    System.out.println(b5.withdraw(-10.0));

}
}