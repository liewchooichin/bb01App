package com.bb01.app.lesson31;

public class UserInputDemo {
  public static double AddTwoNumbers(double x, double y)
  {
    return (x + y);
  }
  public static void main(){
    String userInput = System.console().readLine("What's your name? ");
    System.out.println("Hello " + userInput);
    System.out.println("Enter two numbers:");
    double x = Double.parseDouble(System.console().readLine("x: "));
    double y = Double.parseDouble(System.console().readLine("y: "));
    double result = AddTwoNumbers(x, y);
    System.out.printf("%.4f + %.4f = %.4f \n", x, y, result);
  }
}
