package com.bb01.app.lesson37;

import java.io.IOException;
import java.util.logging.Handler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo {

  private final static Logger logger 
    = Logger.getLogger(LoggerDemo.class.getName());
  
  public static void main() {

    // file logger
    try{
    Handler fileHandler = new FileHandler("log-file.log", true);
    SimpleFormatter formatter = new SimpleFormatter();
    fileHandler.setFormatter(formatter);
    logger.addHandler(fileHandler);
    } catch(IOException exp){
      System.out.println(exp.getMessage());
    }

    logger.info("App started");
    logger.log(Level.SEVERE, " -- Severe --");
    logger.log(Level.WARNING, "-- Warning --");
    logger.log(Level.INFO, " -- Info --");
    // similarly
    logger.severe("-- Severe --");
    logger.warning("-- Warning --");
    logger.info("-- Info --");


    int[] arr1 = { 1, 2, 3, 4 };

    try {
      System.out.println(arr1[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      logger.severe("🔴 " + e.getMessage());
      System.out.println(e);
    } finally {
      logger.warning("🟠 Be careful!");
    }
  
  }
}
