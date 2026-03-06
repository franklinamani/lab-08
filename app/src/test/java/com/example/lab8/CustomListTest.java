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
}

