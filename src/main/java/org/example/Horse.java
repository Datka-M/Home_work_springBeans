package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Horse implements Animal{


    private String name;
    private String country;

    public Horse(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Horse() {
    }

    public String getName() {
        return name;
    }

    @Value("${horse.name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    @Value("${horse.country}")
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Horse: " +
                "name = '" + name + '\'' +
                ", country = '" + country;
    }

    @Override
    public void animalPlus() {
        System.out.println("Horse plus: Ride");
    }

    @Override
    public void animalMinus() {
        System.out.println("Horse minus: Eat a lot");
    }
}
