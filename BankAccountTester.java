public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(5213452, "hello");
    System.out.println(b1.getBalance());
    System.out.println(b1.getAccountID());

    System.out.println(b1.deposit(194.50));
    System.out.println(b1.getBalance());
    System.out.println(b1.deposit(-294.50));
    System.out.println(b1.getBalance());

    System.out.println(b1.withdraw(94.50));
    System.out.println(b1.getBalance());
    System.out.println(b1.withdraw(294.50));
    System.out.println(b1.getBalance());

    System.out.println(b1.toString());
  }
}
