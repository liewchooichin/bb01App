package com.bb01.app.lesson36;

import java.util.ArrayList;

public class Student extends Person {
  private int studentId;
  private String course;
  private int yearEnrolled;
  private int yearLevel;
  private ArrayList<Double> grades;


  // Constructor
  public Student(int studentId, String course, int yearEnrolled, int yearLevel) {
    this.studentId = studentId;
    this.course = course;
    this.yearEnrolled = yearEnrolled;
    this.yearLevel = yearLevel;
    // The grades list should be created in the class, and not
    // passed in from the function.
    this.grades = new ArrayList<Double>();
  }
  // using super class
  public Student(String name, int birthYear, int studentId, 
    String course, int yearEnrolled, int yearLevel) {
    super(name, birthYear); // This calls Person(String name, int birthYear)
    this.studentId = studentId;
    this.course = course;
    this.yearEnrolled = yearEnrolled;
    this.yearLevel = yearLevel;
    this.grades = new ArrayList<Double>();
  }

  // add getters and setters
  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public int getYearEnrolled() {
    return yearEnrolled;
  }

  public void setYearEnrolled(int yearEnrolled) {
    this.yearEnrolled = yearEnrolled;
  }

  public int getYearLevel() {
    return yearEnrolled;
  }

  public void setYearLevel(int yearLevel) {
    this.yearLevel = yearLevel;
  }

  public ArrayList<Double> getGrades() {
    return grades;
  }

  public void setGrades(ArrayList<Double> grades) {
    this.grades = grades;
  }

  // add methods specific to Student
  public void addGrade(double grade) {
    this.grades.add(grade);
  }
    
  public double getAverageGrade() {
    double sum = 0;
    for (double grade : this.grades) {
      sum += grade;
    }
    return sum / this.grades.size();
  }
  // Overload the doWork()
  public void doWork(String work){
    System.out.printf("%s is doing %s.%n", this.name, work);
  }
  // Override the doWork()
  @Override
  public void doWork(){
    System.out.printf("%s is a student.%n", this.name);
  }
  @Override
  public void greet(){
    System.out.println("👋 Hello, my name is " + this.name + " and I am a " + (2023 - this.birthYear) + " year old student.");  
  }
  // Methods
  public void introduce(){
    System.out.printf( "Hello, my name is %s and I am a %d student.%n", this.name, this.yearLevel);
  }
}