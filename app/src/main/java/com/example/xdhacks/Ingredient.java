package com.example.xdhacks;

public class Ingredient {

    private String name;
    private int calCount;

    public Ingredient(String name, int calCount) {
        this.name = name;
        this.calCount = calCount;
    }

    public int getCalCount() {
        return calCount;
    }

    public String getName() {
        return name;
    }
}
