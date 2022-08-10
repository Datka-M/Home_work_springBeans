package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


import org.springframework.stereotype.Component;

@Component
public class Person {


    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;

    @Autowired
    public Person(@Qualifier("horse") Animal animal) {
        this.animal = animal;
    }

    public Person() {
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getYourFavoriteAnimal() {
        System.out.println(name + "'s favorite animal is " + animal);
        animal.animalPlus();
        animal.animalMinus();
    }

    public void getMyFavoriteAnimal() {
        System.out.println("My favorite animal: " + animal);
        animal.animalPlus();
        animal.animalMinus();
    }

    @Override
    public String toString() {
        return "Person: " +
                "animal=" + animal +
                ", name='" + name + '\'' +
                ", age=" + age;
    }

    public void chooseAnimal(Person person) {

        if (person.getAnimal() instanceof Dog ) {
            getMyFavoriteAnimal();
        } else if (person.getAnimal() instanceof Horse) {
            getYourFavoriteAnimal();
        }
    }
}