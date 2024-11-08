package com.bb01.app.lesson36;

public class School 
  implements Building {
  private String name;
  private int numberOfFloors;
  private String address;

  // constructor
  public School(){
    
  }
  public School(String name, int numberOfFloors, String address) {
    this.name = name;
    this.numberOfFloors = numberOfFloors;
    this.address = address;
  }

  // getters and setters
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getNumberOfFloors() {
    return numberOfFloors;
  }
  public void setNumberOfFloors(int numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  
  // Implements methods of the interface
  @Override
  public void addFloors(int floors) {
    // Auto-generated method stub
    this.numberOfFloors = numberOfFloors + floors;
    System.out.printf("This school has %d floors.%n", 
      this.numberOfFloors);
    
  }
  
  @Override
  public void describe() {
    // Auto-generated method stub
    System.out.printf("Name: %s%nAddress:%s%n", this.name, this.address);
  }
 
}
