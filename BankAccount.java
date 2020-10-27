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
}
