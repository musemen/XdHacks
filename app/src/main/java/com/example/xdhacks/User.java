package com.example.xdhacks;

import android.speech.RecognizerIntent;

public class User {

    private String name;
    private int age;
    private String email;
    private int height;
    private int weight;
    private Enum diet;
    private List<Recipe> savedRecipes;
    private List<Recipe> suggestedRecipes;
    private Tracker tracker;

    public User(String name, int age, String email, int height, int weight, Enum diet, List<Recipe> savedRecipes, List<Recipe> suggestedRecipes, Tracker tracker) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.diet = diet;
        this.savedRecipes = savedRecipes;
        this.suggestedRecipes = suggestedRecipes;
        this.tracker = tracker;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getEmail() {
        return email;
    }

    public Enum getDiet() {
        return diet;
    }

    public List<Recipe> getSavedRecipes() {
        return savedRecipes;
    }

    public List<Recipe> getSuggestedRecipes() {
        return suggestedRecipes;
    }

    public Tracker getTracker() {
        return tracker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDiet(Enum diet) {
        this.diet = diet;
    }

    public void setSavedRecipes(List<Recipe> savedRecipes) {
        this.savedRecipes = savedRecipes;
    }

    public void setSuggestedRecipes(List<Recipe> suggestedRecipes) {
        this.suggestedRecipes = suggestedRecipes;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }


}
