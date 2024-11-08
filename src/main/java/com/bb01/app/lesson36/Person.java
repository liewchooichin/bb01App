package com.bb01.app.lesson36;

public class Person {

  // FIELDS
  protected String name;
  protected int birthYear;
  protected String gender;
  protected int age;

  // CONSTRUCTORS
  // during lesson
  public Person() {
  }

  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  }

  // for assignment
  public Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  // INSTANCE METHODS
  // during lesson
  // public void greet() {
  //   System.out.println("👋 Hello, my name is " + this.name + " and I am a " + (2023 - this.birthYear) + " year old " + this.getClass().getSimpleName().toLowerCase() + ".");
  // }

  // for assignment
  //greet
  public void greet(){
    System.out.printf("Nice to meet you, %s.%n", this.name);
  }

  // do work
  public void doWork() {
    System.out.println(this.name + " is working.");
  }

  // introduce
  public void introduce(){
    System.out.printf("Hello, my name is %s.%n", this.name);
  }

  // birthday
  public void haveBirthday(){
    this.age = this.age + 1;
    System.out.printf("Birthday for this year has passed. Now age is %d.%n", this.age);
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
