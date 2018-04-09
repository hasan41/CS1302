
/**
 * Write a description of class BankAccountClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountClient
{
    public static void main (String[] args) {
    double amount = 500;
    BankAccount B1 = new BankAccount("Abel",200.0);
    B1.deposit(500.0);
    B1.withdraw(300.0);
    System.out.println(B1.toString());
    BankAccount B2 = new BankAccount();
    System.out.println(B2.getName());
    System.out.println(B2.getBalance());
    B2.setName("George");
    B2.setBalance(500.0);
    System.out.println(B2.toString());
    
    
    
    
    
    
}
}
