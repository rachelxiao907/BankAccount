public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  // nonstatic = part of obkect, so this. refers to instance variables
  //constructor
  public BankAccount(int a, String p) {
    accountID = a;
    password = p;
    balance = 0;
  }

  public String toString() {
    return "#" + accountID + "\t$" + balance;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
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

  private boolean authenticate(String password) {
    return password.equals(this.password);
  }

}
