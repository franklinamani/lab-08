package com.example.lab8;

import java.util.Objects;

public class City {

    private final String cityName;
    private final String provinceName;

    public City(String cityName, String provinceName) {
        this.cityName = cityName;
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return Objects.equals(cityName, city.cityName) &&
                Objects.equals(provinceName, city.provinceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, provinceName);
    }
}

