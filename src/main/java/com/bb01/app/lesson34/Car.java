package com.bb01.app.lesson34;

public class Car {

  // Static method
  public static void aboutCar() {
    System.out.println("A car is a four-wheeled vehicle");
  }

  // Instance methods
  public void drive() {
    System.out.println("Car moves ahead 1m.");
  }

  public void startEngine() {
    System.out.println("🚗 Starting engine...");
    System.out.println("✅ Engine started...");
    startAircon();
    startRadio();
    checkSeatBelts();
  }

  // overload this startAircon
  private void startAircon() {
    System.out.println("💨 Aircon started!");
  }
  // overloaded method can change the access modifier
  public void startAircon(String airconName){
    System.out.printf("💨 Aircon %s started!\n", airconName);
  }
  // overload this startAircon
  private void startRadio() {
    System.out.println("📻 Radio started!");
  }
  // overloaded method can change the access modifier
  public void startRadio(String radioStation){
    System.out.printf("📻 Tuning in to station %s!\n", radioStation);
  }

  private void checkSeatBelts() {
    System.out.println("🪑 Seat belts checked!");
  }

}
