package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private List <Integer> result = new ArrayList<>();

    public List<Integer> exterminate(List<Integer> numbers){
        for(Integer number: numbers){
            if(number % 2 == 0){
                result.add(number);
            }
        }
        return result;
    }
}
