package com.bb01.app.lesson36;

public interface Drivable {
  public void drive();
  public void stop();

  // default
  default void honk(){
    System.out.println("Honk!");
  }
}
