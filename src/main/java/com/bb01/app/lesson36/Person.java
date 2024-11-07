package com.bb01.app.lesson36;

public class Person {

  // FIELDS
  //private String name;
  //private int birthYear;
  protected String name;
  protected int birthYear;
  protected String gender;
  protected int age;

  // CONSTRUCTORS
  public Person() {
  }

  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  }

  // INSTANCE METHODS
  public void greet() {
    System.out.println("👋 Hello, my name is " + this.name + " and I am a " + (2023 - this.birthYear) + " year old " + this.getClass().getSimpleName().toLowerCase() + ".");
  }

  public void doWork() {
    System.out.println(this.name + " is working.");
  }

  public void introduce(){
    System.out.printf("Hello, my name is %s.%n", this.name);
  }

  // GETTERS AND SETTERS
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getGender(){
    return this.gender;
  }

  public void setGender(String gender){
    this.gender = gender;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getBirthYear() {
    return this.birthYear;
  }

  public void setBirthYear(int birthYear) {
    if (birthYear < 1960 || birthYear > 2021) {
      System.out.println("Invalid birth year.");
      return;
    }
    this.birthYear = birthYear;
  }
}
