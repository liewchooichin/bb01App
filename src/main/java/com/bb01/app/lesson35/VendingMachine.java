package com.bb01.app.lesson35;

import java.util.ArrayList;

enum Drink {
  COKE, SPRITE, FANTA, WATER
}

record VendingTransaction(Drink drink, double amt) {
}

public class VendingMachine {
  private String location;
  private double earnings;
  private double balance;

  // store transactions
  private ArrayList<VendingTransaction> transactions;

  // Add constructor
  public VendingMachine(String location) {
    this.location = location;
    this.earnings = 0;
    this.balance = 0;
    this.transactions = new ArrayList<>();
  }

  // Add instance methods
  private double getPrice(Drink drink) {
    return switch (drink) {
      case COKE -> 1.5;
      case SPRITE -> 1.5;
      case FANTA -> 1.5;
      case WATER -> 1.0;
    };
  }

  public void insertCoin(double amt) {
    this.balance += amt;
    System.out.println("Inserted: " + amt);
    System.out.println("Current balance: " + balance);
  }

  public void selectDrink(Drink drink) {

    System.out.println("Selected: " + drink);
    double currDrinkPrice = getPrice(drink);

    if (this.balance >= currDrinkPrice) {
      this.balance -= currDrinkPrice;
      dispenseDrink(drink);
      // add to machine earnings
      this.earnings += currDrinkPrice;

      // Record the transaction
      this.transactions.add(new VendingTransaction(drink, currDrinkPrice));

      // if there is more money left
      if (this.balance > 0) {
        System.out.println("Returning change: " + this.balance);
        this.balance = 0;
      }
    } else {
      System.out.println("Payment insufficient!");
      System.out.println("You're short of " + (currDrinkPrice - this.balance));

    }
  }

  public void dispenseDrink(Drink drink) {
    System.out.println("Drink " + drink + " dispensed.");
  }

  public void printEarnings() {
    System.out.println("Earnings :" + this.earnings);
  }

  public void printTransactions() {
    for (VendingTransaction transaction : this.transactions) {
      System.out.println(transaction.drink() + "(" + transaction.amt() + ")");
    }
  }

}

