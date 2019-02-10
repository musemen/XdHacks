package com.example.xdhacks;

import android.media.Image;
import android.media.ImageReader;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    public String name;
    public Image jpeg;
    public String description;
    public List<Ingredients> ingredients;
    public List<String> steps;
    public User user;
    public int numberOfLikes;
    public Diet diet;

    public Recipe(String name, Image jpeg, String description, User user) {
        this.name = name;
        this.jpeg = jpeg;
        this.description = description;
        this.ingredients = new ArrayList<>();
        this.steps = new ArrayList<>();
        this.user = user;
    }

    public String getName() {
        return this.name;
    }

    public Image getImage() {
        return this.jpeg;
    }

    public String getDescription() {
        return this.description;
    }

    public int getNumberOfLikes() {
        return this.numberOfLikes;
    }

    public List<Ingredients> getIngredients() {
        return this.ingredients;
    }

    public List<String> getSteps() {
        return this.steps;
    }

    public Diet getDiet() {
        return this.diet;
    }

    public void addLikes() {
        this.numberOfLikes += 1;
    }

    public void addIngredients(Ingredients ingredient) {
        this.ingredients.add(ingredient);
    }

    public void addSteps(String step) {
        this.steps.add(step);
    }

    public void setDiet(Diet d) {
        this.diet = d;
    }

    public void removeStep (){
        this.steps.remove(this.steps.size() - 1);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int totalCalories() {
        int totalCount = 0;
        for(int i = 0; i < this.ingredients.size(); i++) {
            totalCount += this.ingredients.get(i).calCount;
        }
        return totalCount;
    }
}
