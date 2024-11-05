package com.bb01.app.lesson35;

public class AppLesson35 {
  public static void main() {
    Person personA = new Person("Rebecca", 50, "Female", false);
    personA.greet();
    personA.eat("warm, creamy oats porridge");

    Person personB = new Person("Swathi", 45);
    personB.greet();
    personB.eat("chapatti");

    // create a new clone/instance
    Person cloneOfPersonA = new Person(personA);
    System.out.println("A clone of personA.");
    cloneOfPersonA.greet();
    cloneOfPersonA.eat("cheesecake");

    // create a shallow copy of the instance
    Person personB1 = personB;
    personB1.setGender("Female");
    personB1.setMarried(true);
    personB1.greet();

    // call static field
    System.out.println(Person.scientificName);

    // Vending machine
    System.out.println("\nVending Machine");
    VendingMachine ntuVendingMachine = new VendingMachine("NTU");

    ntuVendingMachine.insertCoin(1);
    ntuVendingMachine.selectDrink(Drink.COKE); // should not dispense, insufficient payment
    ntuVendingMachine.insertCoin(0.5);
    ntuVendingMachine.selectDrink(Drink.COKE);

    ntuVendingMachine.insertCoin(0.5); // should not dispense, insufficient payment
    ntuVendingMachine.selectDrink(Drink.WATER);
    ntuVendingMachine.insertCoin(1);
    ntuVendingMachine.selectDrink(Drink.WATER);

    ntuVendingMachine.printEarnings();
    ntuVendingMachine.printTransactions();
  
  }
}
