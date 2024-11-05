package com.bb01.app.lesson35;

public class Person {
  // instance fields
  private String name;
  private int age;
  private String gender;
  private boolean isMarried;
  public static final String scientificName
     = "Homo Sapien";
  private static int personCount = 0;

  // getter and setter
  // count of person instances
  public static int getPersonCount() {
    return personCount;
  }
  // name
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  // age
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  // gender
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  // isMarried
  public boolean isMarried() {
    return isMarried;
  }
  public void setMarried(boolean isMarried) {
    this.isMarried = isMarried;
  }
  // Constructors
  public Person(String name, int age, String gender, boolean isMarried) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.isMarried = isMarried;
    personCount = personCount + 1;
  }
  // Overloading the constructors
  public Person(String name, int age){
    this(name, age, "Unknown", false);
  }
  // Copy constructor
  // A copy constructor is a constructor that takes in an object of the 
  // same class and copies its values to the new object. This is actually
  // just another overloaded constructor.
  public Person(Person person){
    this(
      person.name,
      person.age,
      person.gender,
      person.isMarried
    );
  }
  // Default constructor
  public Person(){
    this("Jane", 50, "Female", true);
  }
  // methods
  // greet
  public void greet() {
    System.out.println("Hello world, I'm " + name + " and I'm a " + age + " year old " + gender + ".");
  }
  // eat
  public void eat(String meal) {
    System.out.println(name + " is currently eating " + meal);
  }
  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", isMarried=" + isMarried + "]";
  }
}