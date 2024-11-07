package com.bb01.app.lesson36;

public class ElectricCar
    extends Vehicle
    implements BatteryPack {
  // fields
  private String name;
  private int year;
  private double batteryLevel;

  // constructors
  public ElectricCar(String name, int year) {
    this.name = name;
    this.year = year;
  }

  public ElectricCar(String make, String name, int year) {
    super(make);
    this.name = name;
    this.year = year;
  }  

  // implements
  // interface of Trackable
  public void track() {
    System.out.printf("Tracking car %s from year %d.%n", this.name, this.year);
  }



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

  // interface of Drivable
  // default: honk()
  public void drive() {
    System.out.println("Driving car...");
  }

  public void stop() {
    System.out.println("Stopping car...");
  }

  public void charge(){
    System.out.println("The electric car is charging.");
  }

  public double getBatteryLevel() {
    return this.batteryLevel;
  }

  public void setBatteryLevel(double batteryLevel) {
    this.batteryLevel = batteryLevel;
  }
}
