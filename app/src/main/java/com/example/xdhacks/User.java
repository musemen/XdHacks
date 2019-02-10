package com.example.xdhacks;

import android.speech.RecognizerIntent;

import java.util.List;

public class User {

    private String name;
    private int age;
    private String email;
    private int height;
    private int weight;
    private Diet diet;
    private List<Recipe> savedRecipes;
    private List<Recipe> suggestedRecipes;
    private Tracker tracker;

    public User(String name, int age, String email, int height, int weight, Diet diet, List<Recipe> savedRecipes, List<Recipe> suggestedRecipes, Tracker tracker) {
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
}
