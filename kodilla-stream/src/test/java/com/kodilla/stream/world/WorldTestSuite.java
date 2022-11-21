package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country china = new Country(new BigDecimal("1439323776"));
        Country india = new Country(new BigDecimal("1380004385"));
        Country indonesia = new Country(new BigDecimal("273523615"));
        Country russia = new Country(new BigDecimal("145934462"));
        Country germany = new Country(new BigDecimal("83783942"));
        Country unitedKingdom = new Country(new BigDecimal("67886011"));
        Country nigeria = new Country(new BigDecimal("206139589"));
        Country ethiopia = new Country(new BigDecimal("114963588"));
        Country egypt = new Country(new BigDecimal("102334404"));

        List<Country> asiaCountryList = new ArrayList<>();
        List<Country> europeCountryList = new ArrayList<>();
        List<Country> africaCountryList = new ArrayList<>();
        List<Continent> continentList = new ArrayList<>();

        asiaCountryList.add(china);
        asiaCountryList.add(india);
        asiaCountryList.add(indonesia);
        europeCountryList.add(russia);
        europeCountryList.add(germany);
        europeCountryList.add(unitedKingdom);
        africaCountryList.add(nigeria);
        africaCountryList.add(ethiopia);
        africaCountryList.add(egypt);

        Continent asia = new Continent(asiaCountryList);
        Continent europe = new Continent(europeCountryList);
        Continent africa = new Continent(africaCountryList);

        continentList.add(asia);
        continentList.add(europe);
        continentList.add(africa);

        World world = new World(continentList);
        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("3813893772");
        //Then
        assertEquals(expectedResult, result);
    }
}
