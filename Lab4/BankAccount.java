
/**
 * Write a description of class BanAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private String name;
    private double balance; 
    
 public BankAccount(String newName, double newBalance) {
     name = newName;
     balance = newBalance;
    }
    public BankAccount() {
     
    }
 public String getName() {
     return name;
    }
 public double getBalance() {
     return balance;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
     public void setBalance(Double newBalance) {
        balance = newBalance;
    }

public double deposit(double amount) {
    balance = balance + amount;
    return balance;
}

public double withdraw(double amount) {
    balance = balance - amount ;
    return balance;
}
public String toString() {
    return "(" + "Your account Details: " + name + ", " + balance + ")";
}
}
