package com.bb01.app.lesson38;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LearnExecutors {

  public static void main() {
    ExecutorService executorService = Executors.newFixedThreadPool(7);  

    Runnable printLettersRunnable = ()->{
      System.out.println(Thread.currentThread().getName() 
        + ": This thread will loop through letters A to E.");
      String[] letters = {"A", "B", "C", "D", "E"};
      for(String letter: letters){
        System.out.println("Current letter: " + letter);
        try{
          Thread.sleep(1000);
        } catch(InterruptedException e){
          System.out.println("Interrupted thread");
        }
      }
    };

    Runnable printSquaresRunnable = ()->{
      System.out.println(Thread.currentThread().getName()  
        + "This thread will print the square of 1 to 5.");
      for(int i=1; i<5; i++){
        System.out.println("Current number: " + i + ", Squared value: " + (i * i));
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println("Interrupted thread");
        }
      }
    };

    // Using executors
    executorService.execute(printLettersRunnable);
    executorService.execute(printSquaresRunnable);
    executorService.execute(printLettersRunnable);
    executorService.execute(printSquaresRunnable);
    // shutdown
    executorService.shutdown();
  }
}
