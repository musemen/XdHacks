package com.example.xdhacks;

import android.annotation.TargetApi;

import java.util.List;
import java.util.Objects;
@TargetApi(19)
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
        int result = 0;

        for (Recipe r : pastRecipes) {
            result += r.totalCalories();
        }

        return result;
    }

    public void todaysTargetCalories() {
        currentConsumption = 0;

        for (Recipe r : todaysRecipes) { // 5% range
            currentConsumption += r.totalCalories();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tracker tracker = (Tracker) o;
        return dailyTarget == tracker.dailyTarget &&
                currentConsumption == tracker.currentConsumption &&
                Objects.equals(todaysRecipes, tracker.todaysRecipes) &&
                Objects.equals(pastRecipes, tracker.pastRecipes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(todaysRecipes, pastRecipes, dailyTarget, currentConsumption);
    }
}
