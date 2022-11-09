package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        System.out.println("Test - pierwszy test jednostkowy:");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - kalkulator:");

        Calculator calculator = new Calculator();
        int addResult = calculator.add(231, 114);
        int subtractResult = calculator.subtract(231, 114);

        if(addResult == (231 + 114) && subtractResult == (231 - 114)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}