public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  //constructor
  public BankAccount(int a, String p) {
    accountID = a;
    password = p;
    balance = 0.0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String pw) {
    password = pw;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount) {
    if (amount >= 0 && amount <= balance) {
      balance -= amount;
      return true;
    }
    return false;
  }

  public String toString() {
    return accountID + "\\t" + balance;
  }
}
