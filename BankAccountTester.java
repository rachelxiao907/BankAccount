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
    //nonstatic = part of object, so this. refers to instance variables
    //obj.method could be static or non static
    BankAccount b2 = new BankAccount(5213452, "no");
    System.out.println(b1.transferTo(b2, 1000, "hello"));

    BankAccount t1 = new BankAccount(8234, "yup");
    BankAccount t2 = new BankAccount(3284, "dog");
    t1.deposit(50);
    System.out.println(t1.getBalance());
    System.out.println(t2.getBalance());
    System.out.println(t1.transferTo(t2, 30, "yup"));
    System.out.println(t2.getBalance());
    System.out.println(t1.getBalance());
  }
}
