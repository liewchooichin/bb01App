package com.bb01.app.lesson37;

// unchecked runtime exception
public class NoNegativeElementException
    extends RuntimeException {
  @Override
  public String toString() {
    return "NoNegativeElementException";
  }

  // constructor
  public NoNegativeElementException(String message) {
    super(message);
  }
}
