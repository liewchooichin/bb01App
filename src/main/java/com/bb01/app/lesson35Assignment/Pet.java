package com.bb01.app.lesson35Assignment;

public class Pet {
    // fields
    private String name;
    private String breed;
    private String gender;
    private Integer age;
    private Boolean isVaccinated;

    // getter and setter
    // name     
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getBreed() {
      return breed;
    }

    public void setBreed(String breed) {
      this.breed = breed;
    }

    public String getGender() {
      return gender;
    }

    public void setGender(String gender) {
      this.gender = gender;
    }

    public Integer getAge() {
      return age;
    }

    public void setAge(Integer age) {
      this.age = age;
    }

    public Boolean isVaccinated() {
      return isVaccinated;
    }
    
    public void setIsVaccinated(Boolean isVaccinated) {
      this.isVaccinated = isVaccinated;
    }

    // constructors
    public Pet(String name, String breed, String gender, Integer age, Boolean isVaccinated) {
      this.name = name;
      this.breed = breed;
      this.gender = gender;
      this.age = age;
      this.isVaccinated = isVaccinated;
    }   
    public Pet(){
      this("Unknown", "Unknown", "Unknown", 0, false);
    }
    // toString
    @Override
    public String toString() {
      return "Pet [name=" + name + ", breed=" + breed + ", gender=" + gender + 
        ", age=" + age + ", isVaccinated=" + isVaccinated + "]";
    }
    // methods
    // call(String sound) - prints the sound 3 times
    public void call(String sound){
      System.out.println(sound + ".");
    }
    //eat(String food) - prints "'name' loves eating 'food'"
    public void  eat(String food){
      System.out.printf("%s loves eating %s.", this.name, food);
    }

    // sleep() - prints "'name' is currently sleeping"
    public void sleep(){
      System.out.printf("%s is currently sleeping.", this.name);
    }
}
