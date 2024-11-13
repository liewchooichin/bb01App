package com.bb01.app.lesson37;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.print.attribute.IntegerSyntax;

public class LearnExceptions {

  // methods
  public static int divide(int x, int y) {
    return x / y;
  }

  // unchecked for negative number
  public static int sumPositiveArray(int[] numbers) {
    int result = 0;
    // sum the integer
    for(int i=0; i<numbers.length; i++){
      //for checked exception
      if(numbers[i] < 0){
        throw new NoNegativeElementException(String.format("%d is a negative numbers.%n", numbers[i]));
      }
      result = result + numbers[i];
    }
    return result;
  }

  // checked exception
  public static double[] divideByElementAtIndex(int[] numbers, int index)
    throws DivideByZeroElementException {
    double[] result = new double[numbers.length];

    // divide the int array by the number at the index
    for(int i=0; i<numbers.length; i++){
      if(numbers[index]==0){
        throw new DivideByZeroElementException(
          String.format("Number at index %d is a zero.%n", i));
      }
      result[i] = numbers[i] / numbers[index];
    }

    return result;
  }

  // divide
  public static int dividePositiveNumbers(int a, int b) 
    throws NegativeNumberException
   {
    if (a < 0 || b < 0) {
      throw new NegativeNumberException
      ("Negative numbers are not allowed.");
    }
    return a / b;
  }
  // throws exception
  public static void readFileFirstLine(String filename) 
  throws FileNotFoundException {

  // Create a new FileInputStream object
  FileInputStream f = new FileInputStream(filename);
  // Create a new Scanner object and pass the FileInputStream object
  Scanner s = new Scanner(f);

  if (s.hasNextLine()) {
    // Print the lines of the file
    while (s.hasNextLine()){
      System.out.println(s.nextLine());
    }
  } else {
    System.out.println("File is empty");
  }
  // Close the scanner
  s.close();

}

  // main
  public static void main() {
    int x = 10;
    int y = 0;

    // LBYL method
    if (y == 0) {
      System.out.println("Cannot divide by zero");
    } else {
      int result = divide(x, y);
      System.out.println(result);
    }

    // EAFP
    try {
      int result = divide(x, y);
      System.out.println(result);
    } catch (ArithmeticException exception) {
      System.out.println(exception);
    } finally {
      System.out.println("This is the finally block");
    }

    // array of int
    int[] numbers = { 0, -1, 10, 20, 30, 40, 50, 0 };
    int index = 5;
    // System.out.println(numbers[index]); // exception

    // lbyl
    if (index >= 0 && index < numbers.length) {
      System.out.println(numbers[index]);
    } else {
      System.out.println("Index is out of bounds");
    }

    // try-catch
    try {
      System.out.println(numbers[index]);
    } catch (ArrayIndexOutOfBoundsException exception) {
      System.out.println(exception);
    }

    // scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");

    // lbyl
    if (scanner.hasNextInt()) {
      int number = scanner.nextInt();
      System.out.println(number);
    } else {
      System.out.println("Input is not an integer");
    }
    // try-catch
    try {
      int number = scanner.nextInt();
      System.out.println(number);
    } catch (InputMismatchException exception) {
      System.out.println(exception);
    } finally {
      scanner.close();
    }

    // catching the throw
    try {
      readFileFirstLine("./data/lesson37test.txt");
    } catch (FileNotFoundException exception) {
      System.out.println(exception.getMessage());
    } catch(NoSuchElementException exception){
      System.out.println(exception.getMessage());
    }

    // custom exception
    try {
      index = -1;
      if (index < 0 || index > numbers.length - 1) {
        throw new InvalidArrayIndexException(index + " is not a valid index!");
      }
      System.out.println(numbers[index]);
    } catch (InvalidArrayIndexException exception) {
      System.out.println(exception);
    }

    // custom exception
    try {
      int result = dividePositiveNumbers(10, -2);
      System.out.println(result);
    } catch (NegativeNumberException exception) {
      System.out.println(exception);
    }

    // unchecked exception
    try{
      int result = sumPositiveArray(numbers);
      System.out.printf("Sum of arrays: %d.%n", result);
    } catch(NoNegativeElementException exception){
      System.out.println(exception.toString() + ": " + exception.getMessage());
    }

    // checked
    try{
      double[] result1 = divideByElementAtIndex(numbers, 0);
      System.out.print("Result of division: ");
      for(int i=0; i<result1.length; i++){
        System.out.printf("%.2f ", result1[i]);
      }
      // newline
      System.out.println();
    } catch(DivideByZeroElementException exception){
      System.out.println(exception.toString() + ": " + exception.getMessage());
    }


  } // close main
} // close class
