package com.bb01.app.lesson38;

import java.util.concurrent.CompletableFuture;

public class LearnCompletableFuture {
  public static void main(String[] args) {
    // For methods that does not return a value, use runAsync
    CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
      calculateBigNumber1();
    });

    // For methods that returns a value, use supplyAsync
    CompletableFuture<Long> future2 = CompletableFuture.supplyAsync(() -> {
      return calculateBigNumber2();
    });
    // To use the result
    future2.thenAccept(result -> System.out.println("result " + result));

    CompletableFuture<Void> future3 = CompletableFuture.supplyAsync(() -> {
      return calculateBigNumber3();
    }).thenAccept(result -> System.out.println("future3 result:" + result)).exceptionally(ex -> {
      System.out.println("🚨 Exception occurred:" + ex.getMessage());
      return null; // return a fallback result
    });

    // block the main thread until future1 is completed
    // future1.join();

    // checked version of join, needs try/catch
    // future1.get();

    // allOf will block the main thread until all futures are completed
    CompletableFuture.allOf(future1, future2, future3).join();

    System.out.println("All futures completed.");

  }

  // method does not return a value
  public static void calculateBigNumber1() {
    long result = 0;
    for (long i = 0; i < 1000000000; i++) {
      result += i;
    }
    System.out.println("Result: " + result);
  }

  // method does return a value
  public static long calculateBigNumber2() {
    long result = 0;
    for (long i = 0; i < 1000000000; i++) {
      result += i;
    }
    return result;
  }

  // throws an exception
  public static long calculateBigNumber3() {
    long result = 0;
    for (long i = 0; i < 1000000000; i++) {
      result += i;
    }
    throw new RuntimeException("Error in calculateBigNumber3");
    // return result;
  }

}

