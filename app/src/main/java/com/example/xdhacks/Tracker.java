package com.example.xdhacks;

import java.util.List;

public class Tracker {

    private List<Recipe> todaysRecipes;
    private List<Recipe> pastRecipes;
    private int dailyTarget;
    private int currentConsumption;

    public Tracker(List<Recipe> todaysRecipes, List<Recipe> pastRecipes, int dailyTarget, int currentConsumption) {
        this.todaysRecipes = todaysRecipes;
        this.pastRecipes = pastRecipes;
        this.dailyTarget = dailyTarget;
        this.currentConsumption = currentConsumption;
    }

    public List<Recipe> getTodaysRecipes() {
        return todaysRecipes;
    }

    public List<Recipe> getPastRecipes() {
        return pastRecipes;
    }

    public int getDailyTarget() {
        return dailyTarget;
    }

    public int getCurrentConsumption() {
        return currentConsumption;
    }

    public void setTodaysRecipes(List<Recipe> todaysRecipes) {
        this.todaysRecipes = todaysRecipes;
    }

    public void setPastRecipes(List<Recipe> pastRecipes) {
        this.pastRecipes = pastRecipes;
    }

    public void setDailyTarget(int dailyTarget) {
        this.dailyTarget = dailyTarget;
    }

    public void setCurrentConsumption(int currentConsumption) {
        this.currentConsumption = currentConsumption;
    }

    public int getPastCaloriesConsummedSoFar() {
        int result;

        for (Recipe r : pastRecipes) {
            result += r.getCalories();
        }

        return result;
    }

    public void todaysTargetCalories() {
        currentConsumption = 0;

        for (Recipe r : todaysRecipes) { // 5% range
            currentConsumption += r.getCalories();
        }
    }

}
