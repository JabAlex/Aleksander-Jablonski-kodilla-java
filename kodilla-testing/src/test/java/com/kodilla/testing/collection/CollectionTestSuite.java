package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: Begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: End");
    }

    @DisplayName("when given empty list, " +
                    "then should return same list"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        Assertions.assertEquals(numbers, result);
    }
    @DisplayName("when given filled list, " +
                    "then should return list with only even numbers"
    )
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(12, 5, 2, 7, 8, 23, 24, 20, 65, 10);
        List<Integer> expectedResult = Arrays.asList(12, 2, 8, 24, 20, 10);
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        Assertions.assertEquals(expectedResult, result);
    }
}
