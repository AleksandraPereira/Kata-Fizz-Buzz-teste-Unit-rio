package org.example;

public class FizzBuzzStage2 {
    public static String fizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0 || Integer.toString(number).contains("3")) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (Integer.toString(number).contains("5")) {
            result += "Buzz";
        }
        return result.isEmpty() ? Integer.toString(number) : result;
    }
}

