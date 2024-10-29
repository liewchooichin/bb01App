package com.bb01.app.lesson33;

import java.util.Arrays;

public class LearnArrays {
  public static void main() {
    // declare an array
    int[] ageList;
    String[] namesList;
    // initialize
    ageList = new int[] { 10, 20, 30 };
    namesList = new String[] { "Bubee", "Wombat", "HeroBee" };
    System.out.println("Age list: " + Arrays.toString(ageList));
    System.out.println("Length of age list: " + ageList.length);
    System.out.println("Names: " + Arrays.toString(namesList));
    System.out.println("Length of name list: " + namesList.length);
    // change an element
    ageList[0] = 40;
    System.out.println("New age list" + Arrays.toString(ageList));

    // Instantiate an array of 5 integers
    int[] scoresList = new int[5];
    scoresList[0] = 60;
    scoresList[1] = 65;
    Integer[] scoresList2 = new Integer[5];
    scoresList2[0] = 70;
    scoresList2[1] = 75;
    System.out.println("Score list 1: " + Arrays.toString(scoresList));
    System.out.println("Score list 2: " + Arrays.toString(scoresList2));

    // Instantiate an array of 10 Strings
    String[] studentsList = new String[10];

    // sorting
    scoresList = new int[] { 7, 3, 8, 4, 5 };
    System.out.println("Before sort : " + Arrays.toString(scoresList));
    Arrays.sort(scoresList);
    System.out.println("After sort : " + Arrays.toString(scoresList));

    // fill the array
    Arrays.fill(scoresList, 100);
    System.out.println("After fill : " + Arrays.toString(scoresList)); 
    // [100, 100, 100, 100, 100]
    // shallow copy
    int[] scoresListCopy = scoresList;
    scoresListCopy[0] = 99;
    System.out.println("scoresList: " + Arrays.toString(scoresList));
    System.out.println("scoresListCopy: " + Arrays.toString(scoresListCopy));
    
    // using Arrays.copyOf()
    scoresListCopy = Arrays.copyOf(scoresList, scoresList.length);
    scoresListCopy[0] = 99;
    scoresListCopy[1] = 90;
    System.out.println("scoresList: " + Arrays.toString(scoresList));
    System.out.println("scoresListCopy: " + Arrays.toString(scoresListCopy));

    // Copy Of Range
    String[] namesList2 = Arrays.copyOfRange(namesList, 0, namesList.length);
    namesList2[0] = "Unicorn";
    System.out.println("Name List 2: " + Arrays.toString(namesList2));
    System.out.println("Name List 1: " + Arrays.toString(namesList));

    // System.arraycopy
    String[] namesList3 = new String[namesList.length]; 
    System.arraycopy(namesList, 0, 
      namesList3, 0, namesList.length);
    namesList3[0] = "Narwahl";
    System.out.println("Name List 3: " + Arrays.toString(namesList3));
    System.out.println("Name List 1: " + Arrays.toString(namesList));

    // binary search
    // Sort
    Arrays.sort(namesList2);
    System.out.println("Sorted name list2: " + Arrays.toString(namesList2));

    // Search
    System.out.println("Name List 2: " + Arrays.toString(namesList2));
    System.out.println("Search for Unicorn " + Arrays.binarySearch(namesList2, "Unicorn"));
    System.out.println("Search for Nothing " + Arrays.binarySearch(namesList2, "Nothing"));

    // Compare
    String[] namesList4 = new String[namesList.length];
    namesList4 = Arrays.copyOf(namesList3, namesList3.length);
    System.out.println("Name List 3: " + Arrays.toString(namesList3));
    System.out.println("Name List 4: " + Arrays.toString(namesList4));
    System.out.println("Name List 3 equals Name List 4: " 
      + Arrays.equals(namesList3, namesList4));
      
  }
}
