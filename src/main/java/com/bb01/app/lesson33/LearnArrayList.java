package com.bb01.app.lesson33;

import java.util.ArrayList;
import java.util.Arrays;

public class LearnArrayList {
  public static void main() {
    ArrayList<String> namesList = new ArrayList<>();
    namesList.add("Ironman");
    namesList.add("Captain America");
    namesList.add("Hawkeye");
    namesList.add("Hulk");

    // get element
    System.out.println(namesList.get(0)); // Ironman
    System.out.println(namesList.get(1)); // Captain America
    System.out.println(namesList.get(2)); // Hawkeye
    System.out.println(namesList.get(3)); // Hulk

    // set element
    namesList.set(0, "Black Widow");
    System.out.println(namesList.get(0)); // Black Widow
    namesList.set(1, "Aquaman");
    System.out.println(namesList.get(1)); // Aquaman

    // remove
    namesList.remove(0);
    System.out.println(namesList);

    // size or length
    System.out.println(namesList.size()); // 3

    // populating with Array.asList()
    ArrayList<String> heroes = new ArrayList<>(Arrays.asList("Ironman", "Captain America", "Hawkeye", "Hulk", "Black Widow", "Thor"));
    System.out.println(heroes.toString());

    // Append an Array to another Array with ArrayList.addAll()
    ArrayList<String> moreHeroes = new ArrayList<>(Arrays.asList("Doctor Strange", "Spiderman", "Black Panther"));
    heroes.addAll(moreHeroes);
    System.out.println(heroes);

    // contains
    System.out.printf("Is Aquaman here? %b\n", namesList.contains("Aquaman")); 
    System.out.printf("Aquaman is at index %d\n", namesList.indexOf("Aquaman")); 

    // villians
    ArrayList<String> villainsList = new ArrayList<>(Arrays.asList("Thanos", "Ultron", "Loki"));
    System.out.println("Is Thanos here? " + villainsList.contains("Thanos"));
    System.out.println("Is Spiderman here? " + villainsList.contains("Spiderman"));
    villainsList.add("Thanos");
    villainsList.add("Ultron");
    System.out.println("First Index of Thanos: " + villainsList.indexOf("Thanos"));
    System.out.println("First Index of Ultron: " + villainsList.indexOf("Ultron"));
    System.out.println("Last index of Thanos: " + villainsList.lastIndexOf("Thanos"));
    System.out.println("Last index of Ultron: " + villainsList.lastIndexOf("Ultron"));

    // remove specified elements in another array
    ArrayList<String> moreVillains = new ArrayList<>(Arrays.asList("Ultron", "Loki"));
    System.out.println("Before removal: " + villainsList);
    villainsList.removeAll(moreVillains);
    System.out.println("After removal: " + villainsList);

    // clear all elements
    villainsList.clear();
    System.out.println(villainsList);

    // is array empty?
    System.out.println("villainsList.isEmpty() " + villainsList.isEmpty());

    // retain elements that 
    System.out.println("Before retain:  " + heroes);
    heroes.retainAll(Arrays.asList("Ironman", "Spiderman"));
    System.out.println("After retain:  " + heroes);
    
  }
}
