package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continentList;

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public BigDecimal getPeopleQuantity(){
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
