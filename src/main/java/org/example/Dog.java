package org.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{


    private String breed;
    private String colour;
    private int weight;

    public Dog() {
    }

    public Dog(String breed, String colour, int weight) {
        this.breed = breed;
        this.colour = colour;
        this.weight = weight;
    }


    public String getBreed() {
        return breed;
    }

    @Value("${dog.breed}")
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    @Value("${dog.colour}")
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    @Value("${dog.weight}")
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "breed = '" + breed + '\'' +
                ", colour = '" + colour + '\'' +
                ", weight = " + weight ;
    }

    @Override
    public void animalPlus() {
        System.out.println("Dog plus: Cute, with a dog is not boring ");
    }

    @Override
    public void animalMinus() {
        System.out.println("Dog minus: Can to die");
    }
}
