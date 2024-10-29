package com.bb01.app.lesson33;

import java.util.ArrayList;

public class Activity {
  public static void main(String[] args) {
    ArrayList<String> suspectsList = new ArrayList<>();
    ArrayList<String> innocentList = new ArrayList<>();
    boolean gettingSuspects = true;
    boolean gettingInnocents = true;

    System.out.println("\nWelcome, let's catch some bad guys!\n");

    // User to input list of suspects
    while (gettingSuspects) {
      String suspect = System.console().readLine("Enter a suspect, blank if done");

      if (suspectsList.contains(suspect)) {
        System.out.println(suspect + " is already a suspect!");
      } else if (suspect.isBlank()) {
        gettingSuspects = false;
      } else {
        suspectsList.add(suspect);
        System.out.println(suspect + " is now a suspect");
      }
    }

    // Show the suspects
    System.out.println("Suspects List: " + suspectsList);

    // User to input list of suspects with alibis
    while (gettingInnocents) {
      String innocent = System.console().readLine("Enter a suspect with an alibi, blank if done");

      if (innocent.isBlank()) {
        gettingInnocents = false;
      } else if (!suspectsList.contains(innocent)) {
        System.out.println(innocent + " is not a suspect!");
      } else {
        innocentList.add(innocent);
        System.out.println(innocent + " is innocent now.");
      }
    }

    // Remove innocent from the suspects list
    suspectsList.removeAll(innocentList);
    System.out.println("Updated suspects list: " + suspectsList);

    String longestName = suspectsList.get(0);
    for (String suspect : suspectsList) {

      if (suspect.length() > longestName.length()) {
        longestName = suspect;
      }
    }

    System.out
        .println("The culprit is " + longestName + " because his name is " + longestName.length() + " letters long.");

  }

}
