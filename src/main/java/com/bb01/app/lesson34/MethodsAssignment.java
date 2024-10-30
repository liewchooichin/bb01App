package com.bb01.app.lesson34;

public class MethodsAssignment {
    public static void main(){
        System.out.println("\n---Assignment 3.4---");
        //Uncomment these to test:
        checkOddEven(998);
        checkOddEven(1237);

        //Uncomment these to test:
        System.out.println(capsCombine("john", "smith"));
        System.out.println(capsCombine("charlize","doe"));

        //Uncomment these to test:
        int test_arr1[] = {1, 2, 3, 4, 5};
        int test_arr2[] = {99, 100, 77, 62, 87, 92, 91, 100};
        System.out.println(getAverage(test_arr1));
        System.out.println(getAverage(test_arr2));

    }

    //1. Create a method called checkOddEven that gets an integer and prints "The number is odd/even" depending on the result.

    public static void checkOddEven(int number){
        if(number%2 == 0){
            System.err.printf("%d is even.\n", number);
        } else if(number%2 == 1){
            System.err.printf("%d is odd.\n", number);
        } else {
            System.err.printf("Cannot determined if %d is odd or even.\n", number);
        }
        return;
    }
    
    //2. Create a method called capsCombine that gets two strings and converts both to uppercase and joins them with a space.

    public static String capsCombine(String s1, String s2){
        StringBuilder builder = new StringBuilder();
        builder.append(s1.toUpperCase());
        builder.append(' ');
        builder.append(s2.toUpperCase());
        return builder.toString();
    }

    //3. Create a method called getAverage that gets an array of numbers and returns the average of the values in the array.

    public static double getAverage(int[] numberArray){
        double average = 0.0D;
        int total = 0;
        for(int num: numberArray){
            // calculate the total expenses
            total = total + num;
        }
        // divide the total with the length of the array
        average = (double) total / (double) (numberArray.length);
        // return the average
        return average;
    }
        
}
