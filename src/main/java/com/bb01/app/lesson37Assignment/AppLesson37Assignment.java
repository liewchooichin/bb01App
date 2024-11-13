package com.bb01.app.lesson37Assignment;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.InputMismatchException;

public class AppLesson37Assignment {
  // main
  public static void main() {
    readInput();
  }

  // read input
  private static void readInput() {
    // log to a file
    // create the logger
    Logger logger = Logger.getLogger(
      AppLesson37Assignment.class.getName());

    Handler logHandler;
    SimpleFormatter logFormatter;
    try {
      // get the log file handler
      logHandler = new FileHandler("./data/lesson37logger.log", true);
      // format the log file
      logFormatter = new SimpleFormatter();
      // add the formatter to the log file handler
      logHandler.setFormatter(logFormatter);
      // add the file handler to the logger
      logger.addHandler(logHandler);
    } catch (IOException exp) {
      System.err.println(exp);
    }
    
    logger.info("Starting the logger.");

    // scanner
    Scanner scanner = new Scanner(System.in);
    logger.info("Instantiating a new console input scanner.");

    // intruction on console
    // get an integer
    System.out.println("Enter a value according to the question."
      + "Enter q to quit.");
    System.out.println("Enter an integer. Enter q to quit. ");
    while(scanner.hasNextLine()){
    if((scanner.next()).equals("q"))
      break;

    try {
      int num = scanner.nextInt();
      System.out.printf("You entered %d.%n", num);
    } catch (InputMismatchException exp) {
      logger.log(Level.INFO, "Input is not an integer.");
      logger.log(Level.SEVERE, "Exception message: {0}", exp);
    } finally {
      logger.log(Level.WARNING, "Enter an integer value.");
    }

    // get an boolean
    System.out.println("Enter an boolean value, e.g. true or false. Enter q to quit.");
    try {
      boolean boo = scanner.nextBoolean();
      System.out.printf("You entered %b.%n", boo);
    } catch (InputMismatchException exp) {
      logger.log(Level.INFO, "Input is not a boolean.");
      logger.log(Level.SEVERE, "Exception message: {0}", exp);
    } finally {
      logger.log(Level.WARNING,   "Enter a boolean value.");
    }

    // get an boolean
    System.out.println("Enter an string value. Enter q to quit.");
    try {
      String str = scanner.nextLine();
      System.out.printf("You entered %s.%n", str);
    } catch (InputMismatchException exp) {
      logger.log(Level.INFO, "Input is not a string.");
      logger.log(Level.SEVERE, "Exception message: {0}", exp);
    } finally {
      logger.log(Level.WARNING,   "Enter a string value.");
    }
    } // end while
    // close the scanner
    scanner.close();

  } // end of method
} // end of class
