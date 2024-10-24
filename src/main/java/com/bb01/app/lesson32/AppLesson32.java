package com.bb01.app.lesson32;

public class AppLesson32 {
  public static void main() {
    ControlAssignment.main();
    //LearnOperators.main();
    String fruit1 = "apple"; // string interning
    String fruit2 = "apple";
    String fruit3 = new String("apple");
    System.out.println("Identity hash code of fruit1: " + System.identityHashCode(fruit1));
    System.out.println("Identity hash code of fruit2: " + System.identityHashCode(fruit2));
    System.out.println("Identity hash code of fruit3: " + System.identityHashCode(fruit3));
    return; 
  }
}
