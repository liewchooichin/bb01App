package com.bb01.app.lesson36;

//import java.util.List;

public class AppLesson36 {
  public static void main() {
    // Instantiating a Student object
    Student student = new Student(1, "Computer Science", 2022, 4);

    // Calling methods from the Person (Parent) class
    student.setName("Tony");
    student.setBirthYear(1995);
    student.greet();
    student.doWork();

    // Calling methods from the Student (Child) class
    System.out.println("I am studying " + student.getCourse());
    student.addGrade(80.0);
    student.addGrade(90.0);
    student.addGrade(70.0);
    student.addGrade(60.0);
    student.greet();
    student.doWork(); // override method
    student.doWork("homework"); // overload method
    student.introduce();
    System.out.println("My average grade is " + student.getAverageGrade());
    // List<Double> grades = student.getGrades();
    // grades.stream().forEach(g -> System.out.printf("Grades: %.2f%n", g));

    // Teacher object
    Teacher teacher = new Teacher("John", 1975, 1, "Mathematics", 5000);
    // Calling Parent class methods
    teacher.greet();
    teacher.doWork();
    teacher.introduce();
    // Calling Child class methods
    System.out.println("I teach " + teacher.getSubject());
    System.out.println("My salary is " + teacher.getSalary());

    // Interface Trackable
    Car car = new Car("Toyota", 2022);
    car.track();
    car.drive();
    car.stop();
    car.honk();
    car.fill();
    car.setFuelLevel(0.8);
    System.out.printf("Fuel level of car is %.2f.%n", car.getFuelLevel());

  
    MobilePhone phone = new MobilePhone("iPhone 14");
    phone.track();
    phone.charge();
    phone.setBatteryLevel(0.8);
    System.out.printf("Battery level of the phone is %.2f.%n", phone.getBatteryLevel());
  
    ElectricCar electricCar = new ElectricCar("BYD", "BYD", 2022);
    electricCar.track();
    electricCar.drive();
    electricCar.stop();
    electricCar.charge();
    electricCar.setBatteryLevel(0.8);
    System.out.printf("Battery level of car is %.2f.%n", 
      electricCar.getBatteryLevel());


    // RCCar rcCar = new RCCar();
    // rcCar.drive();
    // rcCar.stop();
    // rcCar.charge();
    // rcCar.getCharge();

    return;
  }
}
