package com.platzi.javatest.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int n) {

        String result = "";

        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        } else if (n % 3 == 0) {
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else {
            result =  n + "";
        }

        return result;
    }

}
