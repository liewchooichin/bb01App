package com.bb01.app.lesson36;

public class Teacher extends Person {
  private int teacherId;
  private String subject;
  private double salary;

  // constructor
  public Teacher(){

  }
  public Teacher(int teacherId, String subject, double salary) {
    this.teacherId = teacherId;
    this.subject = subject;
    this.salary = salary;
  }
  public Teacher(String name, int birthYear, int teacherId, String subject, double salary) {
    super(name, birthYear);
    this.teacherId = teacherId;
    this.subject = subject;
    this.salary = salary;
  }

  // getters and setters
  public int getTeacherId() {
    return teacherId;
  }
  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  // Methods
  public void introduce(){
    System.out.printf("Hello, my name is %s and I will be teaching you %s .%n", this.name, this.subject);
  }
  
  // Override
  @Override
  public void doWork(){
    System.out.println("Hello, I am teaching.");
  }
  @Override
  public void greet() {
    System.out.println("👋 Hello, my name is " + this.name + " and I am a " + (2023 - this.birthYear) + " year old teacher.");
  }
  
  
}
