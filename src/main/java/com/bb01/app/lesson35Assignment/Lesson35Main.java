package com.bb01.app.lesson35Assignment;

public class Lesson35Main {
    public static void main() {
      // a dog
      Pet dog = new Pet("Doggie", "Singapore Local", "Female",
        5, true);
      dog.call("Woof, woof, woof");
      dog.eat("yummy turkey dinner.");
      dog.sleep();
      // a cat
      Pet cat = new Pet("Kittie", "Domestic short hair",
        "Female", 6, true);
      cat.call("Meow, meow, meow");
      cat.eat("delicious salmon in gravy");
      cat.sleep();
      return;
    }
}
