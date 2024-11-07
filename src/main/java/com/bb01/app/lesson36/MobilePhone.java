package com.bb01.app.lesson36;

public class MobilePhone
  implements Trackable, BatteryPack {
    // fields
    private String model;
    private double charge;
    private double batteryLevel;
    // constructor
    public MobilePhone(){

    }
    public MobilePhone(String model) {
      this.model = model;
    }
    // getters and setters
    public String getModel() {
      return model;
    }
    public void setModel(String model) {
      this.model = model;
    }
    // implements the method
    @Override
    public void track(){
      System.out.printf("Tracking mobile phone %s.%n", this.model);
    }
    // method
    public void charge(){
      System.out.println("The phone is charging.");
    }
    public double getBatteryLevel(){
      return this.batteryLevel;
    }
    public void setBatteryLevel(double batteryLevel){
      this.batteryLevel = batteryLevel;
    }
}
