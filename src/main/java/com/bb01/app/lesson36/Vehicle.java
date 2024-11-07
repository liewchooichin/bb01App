package com.bb01.app.lesson36;

public abstract class Vehicle
  implements Drivable, Trackable {
  private String make;
  
  // constructor
  public Vehicle(){

  }
  public Vehicle(String make) {
    this.make = make;
  }
  // getter and setters
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }

  // implement
  public abstract void track();
    
  // interface of Drivable
  // default: honk()
  public abstract void drive();
}
