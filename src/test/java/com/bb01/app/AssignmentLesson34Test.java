package com.bb01.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bb01.app.lesson34.MethodsAssignment;


public class AssignmentLesson34Test {
  @Test
  public void capitalizeAndCombine(){
    String result = MethodsAssignment.capsCombine("arabica", "coffee");
    assertEquals("ARABICA COFFEE", result);
  }

  @Test
  public void calculateAverage(){
    // average 10
    Double result = MethodsAssignment.getAverage(new int[] {10, 10, 10}); 
    assertEquals((double)10.0, result);
  }

}
