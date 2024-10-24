package com.bb01.app.lesson32;

/**
 * Result of the assignment:
    995 is divisible by 5: true 
    15 is divisible by 3: true. 
    15 is divisible by 5: true 
    15 is divisible by 3 and 5: true 
    25 is divisible by 5: true 
    45 is divisible by 3: true. 
    45 is divisible by 5: true 
    45 is divisible by 3 and 5: true 
    16 is not divisible by 3 or 5 
    Budget 72.699997 is between 50 and 100, ride a TRAIN.
    Budget 105.500000 is greater than 100, ride a TAXI.
    Budget 25.500000 is between 20 and 49, ride a BUS.
    Budget 5.500000 is between 0 and 19, ride a WALK.
    Animal number is a RAT.
    Animal number is a DOG.
    Animal number is a ROOSTER.
    
 */

public class ControlAssignment {

    public static void divisibleBy3or5(int num) {
        // Task 1. Determine if a number is divisible by 3, 5 or both.
        int numToTest = num;
        boolean isDivisibleBy3 = false;
        boolean isDivisibleBy5 = false;
        // Add code here
        if (numToTest % 3 == 0) {
            isDivisibleBy3 = true;
            System.out.printf("%d is divisible by 3: %b. \n", numToTest, isDivisibleBy3);
        }
        if (numToTest % 5 == 0) {
            isDivisibleBy5 = true;
            System.out.printf("%d is divisible by 5: %b \n", numToTest, isDivisibleBy5);
        }
        if ((numToTest % 3 == 0) && (numToTest % 5 == 0)) {
            isDivisibleBy3 = true;
            isDivisibleBy5 = true;
            System.out.printf("%d is divisible by 3 and 5: %b \n", numToTest, (isDivisibleBy3 && isDivisibleBy5));
        }
        // isDivisible can only be true if any of the other three conditions above
        // is true.
        if (isDivisibleBy3 == false && isDivisibleBy5 == false) {
            System.out.printf("%d is not divisible by 3 or 5 \n", numToTest);
        }
        return;
    }

    /*
     * Task 2. Given a sample budget, determine what to ride given the following
     * conditions:
     * - if budget is greater than 100, ride a taxi
     * - if budget is between 50 to 100, ride train
     * - if budget is between 20 to 49, ride bus
     * - if budget is between 0 to 19, walk
     * 
     * Reference: What is enum? https://www.w3schools.com/java/java_enums.asp
     */
    public static void walkOrRide(float budget) {
        // float budget = 72.7f;
        enum TransportMode {
            TAXI,
            TRAIN,
            BUS,
            WALK,
        }
        TransportMode mode = TransportMode.WALK;
        // Add code here
        if (budget > 100.0F) {
            mode = TransportMode.TAXI;
            System.out.printf("Budget %f is greater than 100, ride a %s.\n", budget, mode);
        } else if (budget > 50.0F) {
            mode = TransportMode.TRAIN;
            System.out.printf("Budget %f is between 50 and 100, ride a %s.\n", budget, mode);
        } else if (budget > 20.0F) {
            mode = TransportMode.BUS;
            System.out.printf("Budget %f is between 20 and 49, ride a %s.\n", budget, mode);
        } else {
            mode = TransportMode.WALK;
            System.out.printf("Budget %f is between 0 and 19, ride a %s.\n", budget, mode);
        }

    }

    /*
     * Task 3. Use a switch case to determine the zodiac animal given a number from
     * 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
     * 
     * Code Challenge: Delcare and use enum for your zodiac
     * 
     * Reference:
     * https://javaspringworks.com/java-enum-guide/
     * https://howtodoinjava.com/java/enum/java-enum-string-example/
     */
    public enum ZodiacAnimal {
        RAT, OX, TIGER, RABBIT, DRAGON, SNAKE,
        HORSE, GOAT, MONKEY, ROOSTER, DOG, PIG
    }

    public static void getZodiacAnimal(ZodiacAnimal animalNumber) {
        switch (animalNumber) {
            case RAT -> 
                System.out.printf("Animal number is a %s.\n",ZodiacAnimal.RAT);
            case OX ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.OX);
            case TIGER ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.TIGER);
            case RABBIT ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.RABBIT);
            case DRAGON ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.DRAGON);
            case SNAKE ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.SNAKE);
            case HORSE ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.HORSE);
            case GOAT ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.GOAT);
            case MONKEY ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.MONKEY);
            case ROOSTER ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.ROOSTER);
            case DOG ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.DOG);
            case PIG ->
                System.out.printf("Animal number is a %s.\n", ZodiacAnimal.PIG);
            default ->
                System.out.printf("No animal found.\n", ZodiacAnimal.PIG);
        }
    }

    // Add code here

    public static void main() {
        // Task 1
        divisibleBy3or5(995);
        divisibleBy3or5(15);
        divisibleBy3or5(25);
        divisibleBy3or5(45);
        divisibleBy3or5(16);
        // Task 2
        walkOrRide(72.7f);
        walkOrRide(105.5f);
        walkOrRide(25.5f);
        walkOrRide(5.5f);
        // Task 3
        getZodiacAnimal(ZodiacAnimal.RAT);
        getZodiacAnimal(ZodiacAnimal.DOG);
        getZodiacAnimal(ZodiacAnimal.ROOSTER);
    }

}
