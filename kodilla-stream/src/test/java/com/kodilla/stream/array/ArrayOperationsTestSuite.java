package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int numbers[] = {1, 2, 6 ,23 , 65, 12, 78};
        //When
        double result = ArrayOperations.getAverage(numbers);
        double expectedResult = 26.714;
        //Then
        assertEquals(expectedResult, result, 0.001);
    }
}
