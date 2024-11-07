package com.bb01.app.lesson36;

public class Car 
  extends Vehicle
  implements  FuelTank {
  private String name;
  private int year;
  double fuelLevel;
  // constructor
  public Car(String name, int year) {
    this.name = name;
    this.year = year;
  }
  // getters and setters
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  // implement the abstract method
  // interface of Trackable
  @Override
  public void track(){
    System.out.printf("Tracking car %s from year %d.%n", this.name, this.year);
  }
  // interface of Drivable
  // default: honk()
  public void drive() {
    System.out.println("Driving car...");
  }

  public void stop() {
    System.out.println("Stopping car...");
  }
  // Fuel tank
  public void fill(){
    System.out.println("Fill the tank.");
  }
  // set and get the fuel level
  public void setFuelLevel(double fuelLevel){
    this.fuelLevel = fuelLevel;
  }
  public double getFuelLevel(){
    System.out.printf("Fuel level is %.2f.%n", this.fuelLevel);
    return this.fuelLevel;
  }
}
