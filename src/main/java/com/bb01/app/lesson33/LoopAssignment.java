package com.bb01.app.lesson33;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopAssignment {
    public static void main(){
        // Task 1. Create a while loop that prints all the odd numbers from 1 to 50
        int i = 1;
        System.out.println("Task 1: Odd numbers");
        while(i <= 50){
            // check for odd number - not divisible by 2
            // i modulo 2 == 1
            if((i%2) == 1){
                System.out.printf("%d, ", i);
            }
            // increment i
            i = i + 1;
        }
        // print a newline
        System.out.println();

        /* 
            Task 2. Create a do-while loop that prints the following pattern from 1 to 30:
            If the number is divisible by 3, print "Fizz"
            If the number is divisible by 5, print "Buzz"
            If the number is divisible by 3 AND 5, print "FizzBuzz"
            If the number is not divisible by 3 nor 5, print "Pop"
        */
        i = 1; // reinitialize i
        System.out.println("\nTask 2");
        do {
            if((i%3 == 0) && (i%5 == 0)){
                System.out.printf("%2d - %s\n", i, "FizzBuzz");
            }
            else if(i%5 == 0){
                System.out.printf("%2d - %s\n", i, "Buzz");
            }
            else if(i%3 == 0){
                System.out.printf("%2d - %s\n", i, "Fizz");
            }
            else{
                System.out.printf("%2d - %s\n", i, "Pop");
            }
            // increment i
            i = i + 1;
        } while(i<=30);
        

        // Task 3. Use an enhanced for-loop to compute for the average of the given array
        int[] expenses = {120, 130, 114, 112, 132, 154, 123, 112, 165, 144, 188, 200};
        float average = 0.0f;
        int total = 0;
        for(int exp: expenses){
            // calculate the total expenses
            total = total + exp;
        }
        // divide the total with the length of the array
        average = (float) total / (float) (expenses.length);
        System.out.println("\nTask 3");
        System.out.printf("Total is %d.\n", total);
        System.out.printf("Average expenses is %.2f.\n", average);
        
       
        
    }
}
