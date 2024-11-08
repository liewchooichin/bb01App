package com.bb01.app.lesson36;

public class AppLesson36Assignment {
  public static void main() {
    School school = new School(
      "PACE School",
      5,
      "1, North Buona Vista Road"
    );
    Teacher teacher = new Teacher("Jan", 43, "Female", 
      "Java Programming");

    Student student = new Student("May", 52, "Female", 
      3);

    // school
    System.out.println("School");
    System.out.printf("Name: %s.%n", school.getName());
    System.out.printf("Address: %s.%n", school.getAddress());
    school.addFloors(10);
    school.describe();

    // teacher
    System.out.printf("%nTeacher%n");
    System.out.printf("Name: %s.%n", teacher.getName());
    System.out.printf("Age: %s.%n", teacher.getAge());
    System.out.printf("Gender: %s.%n", teacher.getGender());
    System.out.printf("Subject: %s.%n", teacher.getSubject());
    teacher.greet();
    teacher.introduce();
    teacher.haveBirthday();
    
    // student
    System.out.printf("%nStudent%n");
    System.out.printf("Name: %s.%n", student.getName());
    System.out.printf("Age: %s.%n", student.getAge());
    System.out.printf("Gender: %s.%n", student.getGender());
    System.out.printf("Year level: %s.%n", student.getYearLevel());
    student.greet();
    student.introduce();

  }
}
