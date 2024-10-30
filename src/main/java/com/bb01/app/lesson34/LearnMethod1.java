package com.bb01.app.lesson34;

public class LearnMethod1 {
  public static void main() {
    // Car static method
    Car.aboutCar();
    // Call an instance method
    Car myCar = new Car();
    myCar.drive();
    myCar.startEngine();
    myCar.startAircon("Sub-Zero-Degree");
    myCar.startRadio("Spring Cricket");
    // myCar.checkSeatBelts();

  }

}
