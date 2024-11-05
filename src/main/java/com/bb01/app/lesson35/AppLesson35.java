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

    // count of person
    System.out.printf("Count of Person instantiated: %d%n", 
      Person.getPersonCount());

  }
}
