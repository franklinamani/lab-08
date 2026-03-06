package com.example.lab8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomListTest {

    private CustomList mockCityList() {
        return new CustomList();
    }

    @Test
    public void hasCity_returnsTrueAfterAddingCity() {
        CustomList cityList = mockCityList();
        City edmonton = new City("Edmonton", "Alberta");

        // initially the list does not contain the city
        assertFalse(cityList.hasCity(edmonton));

        // after adding, hasCity should return true
        cityList.addCity(edmonton);
        assertTrue(cityList.hasCity(edmonton));
    }

    @Test
    public void deleteCity_removesExistingCity() {
        CustomList cityList = mockCityList();
        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        cityList.addCity(edmonton);
        cityList.addCity(calgary);

        // both cities present
        assertTrue(cityList.hasCity(edmonton));
        assertTrue(cityList.hasCity(calgary));

        // delete one city
        cityList.deleteCity(edmonton);

        // edmonton gone, calgary still present
        assertFalse(cityList.hasCity(edmonton));
        assertTrue(cityList.hasCity(calgary));
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteCity_throwsWhenCityNotPresent() {
        CustomList cityList = mockCityList();
        City edmonton = new City("Edmonton", "Alberta");

        // deleting a city that is not in the list should throw
        cityList.deleteCity(edmonton);
    }

    @Test
    public void countCities_tracksNumberOfCities() {
        CustomList cityList = mockCityList();

        // initially empty
        org.junit.Assert.assertEquals(0, cityList.countCities());

        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        cityList.addCity(edmonton);
        org.junit.Assert.assertEquals(1, cityList.countCities());

        cityList.addCity(calgary);
        org.junit.Assert.assertEquals(2, cityList.countCities());

        cityList.deleteCity(edmonton);
        org.junit.Assert.assertEquals(1, cityList.countCities());
    }
}

