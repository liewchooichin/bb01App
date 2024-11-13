package com.bb01.app.lesson37;

public class NegativeNumberException extends Exception {
  @Override
  public String toString(){
    return "NegativeNumberException";
  }
  // constructor
  public NegativeNumberException(String message) {
    super(message);
  }
}