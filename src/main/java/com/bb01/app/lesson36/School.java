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

  // Implements methods of the interface
  @Override
  public void addFloors(int floors) {
    // Auto-generated method stub
    this.numberOfFloors = numberOfFloors + floors;
    
  }
  
  @Override
  public void describe() {
    // Auto-generated method stub
    System.out.printf("This is %s. It has %d floors. Its address is %s.%n", this.name, this.numberOfFloors, this.address);
  }
 
}
