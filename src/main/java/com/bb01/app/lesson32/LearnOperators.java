package com.bb01.app.lesson32;

public class LearnOperators {

  public static void main() {
    // Arithmatic operators
    int a = 40;
    int b = 20;
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("b % a = " + (b % a));
    // Unary operators
    int unaryPlus = +10;
    int unaryMinus = -10;
    System.out.printf("unaryPlus: %d\n", unaryPlus);
    System.out.printf("unaryMinus: %d\n", unaryMinus);

    int preIncrement = ++unaryPlus;
    System.out.println("preIncrement: " + preIncrement);

    int preDecrement = --unaryMinus;
    System.out.println("preDecrement: " + preDecrement);

    int postIncrement = unaryPlus++;
    System.out.println("postIncrement: " + postIncrement);

    int postDecrement = unaryMinus--;
    System.out.println("postDecrement: " + postDecrement);

    boolean isTrue = true;
    System.out.println("isTrue: " + isTrue);
    System.out.println("!isTrue: " + !isTrue);

    // Pre and post increment/decrement
    int x = 10;
    int y = 10;

    System.out.println("x: " + x);
    System.out.println("y: " + y);

    System.out.println("x++: " + x++);
    System.out.println("++y: " + ++y);

    System.out.println("x: " + x);
    System.out.println("y: " + y);

    // compound assignment
    int compoundAdd = 8;
    compoundAdd += 10;
    System.out.println("compoundAdd: " + compoundAdd);

    int compoundSub = 10;
    compoundSub -= 5;
    System.out.println("compoundSub: " + compoundSub);
    System.out.println();

    // Relational operators
    System.out.println("a == b: " + (a == b));
    System.out.println("a != b: " + (a != b));
    System.out.println("a > b: " + (a > b));
    System.out.println("a >= b: " + (a >= b));
    System.out.println("a < b: " + (a < b));
    System.out.println("a <= b: " + (a <= b));

    // Logical and conditional operators
    boolean value1 = true;
    boolean value2 = false;
    System.out.println("value1 && value2: " + (value1 && value2));
    System.out.println("value1 || value2: " + (value1 || value2));
    System.out.println("!value1: " + (!value1));
    System.out.println(a > b ? "a is larger" : "b is larger");

    // Type comparison
    String name = "John";
    System.out.println("name is String?" + name instanceof String);

    // Operator precedence
    int order1 = 10 + 5 * 2;
    int order2 = (10 + 5) * 2;
    System.out.println("10 + 5 * 2: " + order1);
    System.out.println("(10 + 5) * 2: " + order2);
  }
}
