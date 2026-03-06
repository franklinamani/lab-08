package com.example.lab8;

import java.util.ArrayList;
import java.util.List;

public class CustomList {

    private final List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City is not in the list");
        }
        cities.remove(city);
    }
}

