package com.bb01.app.lesson38;

public class MultipleThreads {
  public static void main() {
    BankAccount account = new BankAccount(1000);
    System.out.println("Initial Balance: $" + account.getBalance());

    Runnable depositRunnable = () -> {
      // add $100 5 times
      for (int i = 0; i < 5; i++) {
        account.deposit(100);
      }
    };

    Runnable withdrawRunnable = () -> {
      // withdraw $200 5 times
      for (int i = 0; i < 5; i++) {
        account.withdraw(200);
      }
    };
    // 100*5*2 - 200*5*2 = 0
    Thread depositThread1 = new Thread(depositRunnable);
    Thread depositThread2 = new Thread(depositRunnable);
    Thread withdrawThread1 = new Thread(withdrawRunnable);
    Thread withdrawThread2 = new Thread(withdrawRunnable);

    depositThread1.start();
    depositThread2.start();
    withdrawThread1.start();
    withdrawThread2.start();
  }
}

class BankAccount {
  private double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public synchronized void deposit(double amount) {
    balance += amount;
    System.out.println("🟢 Deposited: $" + amount + ", Current Balance: $" + balance);
  }

  public synchronized void withdraw(double amount) {
    balance -= amount;
    System.out.println("🔴 Withdrawn: $" + amount + ", Current Balance: $" + balance);
  }

}