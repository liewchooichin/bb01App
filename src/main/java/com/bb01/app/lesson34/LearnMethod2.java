package com.bb01.app.lesson34;

enum Position {
  MANAGER, CEO, STAFF;
}

enum EPayment {
  PAYNOW, GRABPAY, FAVEPAY;
}

class VendingMachine {
  public void makePayment(double amount) {
    System.out.println("Accepting cash payment of: " + amount);
    dispenseDrink();
  }

  public void makePayment(EPayment payment) {
    boolean paymentSuccess = switch (payment) {
      case PAYNOW -> connectPayNow();
      case GRABPAY -> connectGrabPay();
      case FAVEPAY -> connectFavePay();
    };

    if (paymentSuccess) {
      dispenseDrink();
    } else {
      System.out.println("Payment unsuccessful");
    }
  }

  private void dispenseDrink() {
    System.out.println("Dispensing drink...");
  }

  private boolean connectPayNow() {
    System.out.println("Connecting to PayNow...");
    System.out.println("PayNow success!");
    return true;
  }

  private boolean connectFavePay() {
    System.out.println("Connecting to FavePay...");
    System.out.println("FavePay success!");
    return true;
  }

  private boolean connectGrabPay() {
    System.out.println("Connecting to GrabPay...");
    System.out.println("GrabPay failed!");
    return false;
  }

}

public class LearnMethod2 {

  public static void main() {
    System.out.println("Employee bonus: " + calcBonus(5000));
    // System.out.println("Staff bonus: " + calcBonus(5000, 0.2));
    System.out.printf("Staff bonus: $%.2f\n", calcBonus(5000, 0.2));
    System.out.println("CEO bonus: " + calcBonus(20000, 1.5));

    System.out.println("CEO Bonus: " + calcBonus(20000, Position.CEO));
    System.out.println("Manager Bonus: " + calcBonus(10000, Position.MANAGER));
    System.out.println("Staff Bonus: " + calcBonus(5000, Position.STAFF));

    double[] salaries1 = { 1000, 2000, 3000 };
    double[] salaries2 = { 3000, 4000, 5000, 2500, 7500, 2100, 3000, 4000, 5000, 2500, 7500, 2100 };
    System.out.println("Variable Worker 1 bonus: " + calcBonus(salaries1));
    System.out.println("Variable Worker 2 bonus: " + calcBonus(salaries2));

    VendingMachine myVendingMachine = new VendingMachine();
    myVendingMachine.makePayment(10.0); // cash
    myVendingMachine.makePayment(EPayment.GRABPAY); // cashless, no amount needed
    myVendingMachine.makePayment(EPayment.FAVEPAY);
    myVendingMachine.makePayment(EPayment.PAYNOW);

  }

  public static double calcBonus(double salary) {
    return salary * 0.1;
  }

  public static double calcBonus(double salary, double bonusRate) {
    return salary * bonusRate;
  }

  public static double calcBonus(double salary, Position position) {
    return switch (position) {
      case CEO -> salary * 3;
      case MANAGER -> salary * 0.2;
      case STAFF -> salary * 0.1;
    };
  }

  public static double calcBonus(double[] salaries) {
    if (salaries.length < 6) {
      return 0;
    }

    double annualSalary = 0;
    for (double salary : salaries) {
      annualSalary += salary;
    }

    // return (annualSalary / salaries.length) * 0.1;
    return calcBonus(annualSalary / salaries.length);
  }

}
