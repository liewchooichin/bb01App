package com.bb01.app.lesson38;




  public class LearnThreads {
    public static void main() {
      System.out.println();
      System.out.println(Thread.currentThread().getName() + ": App started.");
      // simulateLongDelay(10000, "Completed time intensive task!");
  
      MyFirstThread myFirstThread = new MyFirstThread();
      // can try .start and .run separately
      myFirstThread.start();
      // myFirstThread.run();
  
      Runnable myRunnable = new MyFirstRunnable();
      Thread runnableThread = new Thread(myRunnable);
      // Thread runnableThread = new Thread(new MyFirstRunnable());
      runnableThread.start();
    
      System.out.println(Thread.currentThread().getName() + ": Hello World!");

      // calculate 
    MySecondThread mySecondThread = new MySecondThread();
    mySecondThread.start();

    Runnable mySecondRunnable = new MySecondRunnable();
    Thread runnableThread2 = new Thread(mySecondRunnable);
    runnableThread2.start();

    // Anonymous Class
    Thread anonRunnableThread = new Thread(new Runnable(){
      @Override
      public void run(){
        String info = Thread.currentThread().getName() + ": Using anonymous thread!";
      System.out.println(info);
        simulateLongDelay(7400, "Completed Time Intensive Task using Anonymous Class.");
      }
    });
    anonRunnableThread.start();

    // Using lambda
    Runnable runnableA = new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + "Test runnableA");
        simulateLongDelay(4400, "Completed Time Intensive Task using Anonymous Class.");

      }
    };
    //runnableA.run();
    Thread lambdaThread1 = new Thread(runnableA);
    lambdaThread1.start();

    // In similar patter using lambda
    Runnable runnableB = () -> {
      System.out.println(Thread.currentThread().getName() + " Test runnableB");
      simulateLongDelay(9400, "Completed Time Intensive Task using Anonymous Class.");
    };
    //runnableB.run(); // start
    Thread lambdaThread2 = new Thread(runnableB);
    lambdaThread2.start();

    // runnable C
    Thread lambdaThread3 = new Thread(()->{
      System.out.println(Thread.currentThread().getName() + " lambda thread C");
    });
    lambdaThread3.start();

    // calculate big number
    Thread lambdaCalcBigNumber1 = new Thread(() -> {
      System.out.println(Thread.currentThread().getName() + " lambda thread calculate big number");
      calculateBigNumber((long)1_000_000L);
    });
    lambdaCalcBigNumber1.start();


    // start Thread directly without assigning a variable
    new Thread(()->{
      System.out.println(Thread.currentThread().getName() + " Test runnableB");
      simulateLongDelay(6400, "Completed Time Intensive Task using Anonymous Class.");
    }).start();

    // sleep and interrup
    Thread sleepyThread = new Thread(()->{
      try{
        System.out.println(Thread.currentThread().getName() + ": sleepyThread is going to sleep.");
        Thread.sleep(8000);
        System.out.println(Thread.currentThread().getName() + ": sleepyThread wakes up.");
      } catch(InterruptedException exp){
        System.out.println(Thread.currentThread().getName() + ": sleepyThread was interrupted.");
      }
    });
    sleepyThread.start(); // Thread-10: sleepyThread was interrupted.
    //sleepyThread.interrupt();  // Thread-10: sleepyThread was interrupted.
    // if without interrupt
    // Thread-10: sleepyThread wakes up.

    // check resources
    Thread resourceChecker = new Thread(new ResourceChecker());
    resourceChecker.start();
    // e.g. user cancel the operation
    boolean isCancelled = true; // true to interrupt
    if(isCancelled){
      resourceChecker.interrupt();
    }

    } // end main
  
    public static void simulateLongDelay(int milliseconds, String message) {
      // Get the current time in milliseconds
      long startTime = System.currentTimeMillis();
  
      // Loop until the specified no. of ms has passed
      while (System.currentTimeMillis() - startTime < milliseconds) {
        // do nothing e.g. doing something heavy here
      }
  
      System.out.println(message);
    }
    
    public static void calculateBigNumber(long number) {
      long result = 0;
      for (long i = 0; i < number; i++) {
        result += i;
      }
      System.out.println("Result: " + result);
    }
  }
  
  class ResourceChecker implements Runnable {
    @Override
    public void run(){
      System.out.println("Checking for resources ...");
      try{
        // simulate checking an API
        Thread.sleep(4000);
        System.out.println("Resources are available.");
      } catch (InterruptedException e){
        System.out.println("ResourceChecker was interrupted!");
      }
    }
  }


  class MyFirstThread extends Thread {
    @Override
    public void run() {
      LearnThreads.simulateLongDelay(5000, Thread.currentThread().getName() + ": Completed time intensive task using Thread!");
    }
  }

  class MySecondThread extends Thread {
    @Override
    public void run() {
      String info = Thread.currentThread().getName() + ": Calculating big number using Thread!";
      System.out.println(info);
      LearnThreads.calculateBigNumber((long)1_00_000_000L);
    }
  }
  
  class MyFirstRunnable implements Runnable {
    @Override
    public void run() {
      LearnThreads.simulateLongDelay(3000, Thread.currentThread().getName() + ": Completed time intensive task using Runnable!");
    }  
  }
  class MySecondRunnable implements Runnable {
    @Override
    public void run() {
      String info = Thread.currentThread().getName() + ": Calculating big number using Runnable!";
      System.out.println(info);
      LearnThreads.calculateBigNumber((long)4_00_000_000L);
    }
  
  }



