package com.bb01.app.lesson31;

public class LearnDataTypes {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = Integer.parseInt(args[0]);
    System.out.println(num1 + num2);

    // cast 
    int a = 10;
    double b = 1.9;
    int result = a + (int)b;
    System.out.println("result " + result);
    // implicit casting
    double result2 = a + b;
    System.out.println("result2 " + result2);
    // widening
    int myInt = 9;
    double myDouble = myInt; // int to double
    System.out.println(myInt);
    System.out.println(myDouble);
    // narrowing
    double myDouble2 = 9.78;
    int myInt2 = (int) myDouble2;
    System.out.println(myInt2);
    System.out.println(myDouble2);
    // numeric literal character suffixes
    // L for long
    long longNum = 1001100110011001L;
    // F for float
    // Without suffix F, Java will default it 
    // to double.
    float floatNum = 1.589F;
    // D for double
    double doubleNum = 3.412D;
    // String



  }
}
