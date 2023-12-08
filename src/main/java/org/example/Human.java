package org.example;

public class Human {
    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        if (weight > 40) {
            this.weight = weight;
        }
    }
}
