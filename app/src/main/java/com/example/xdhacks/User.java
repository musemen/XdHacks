package com.example.xdhacks;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.media.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
@TargetApi(19)
public class User {

    private String name;
    private int age;
    private String email;
    private int height;
    private int weight;
    private Diet diet;
    public List<Recipe> likedRecipes;
    public List<Recipe> ownRecipes;
    private Tracker tracker;
    public HashMap<Ingredient,Integer> ingredients;


    public User(String name, int age, String email, int height, int weight, Diet diet, Tracker tracker) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.diet = diet;
        this.likedRecipes = new ArrayList<>();
        this.tracker = tracker;
        this.ingredients = new HashMap<>();
        this.ownRecipes = new ArrayList<>();
        Community.allUsers.add(User.this);
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

    public void setDiet(Diet d) {
        this.diet = d;
    }
    //updates recipe and also adds to the liked ingredients if not already there
    public void addToLikedRecipes(Recipe r) {
        this.likedRecipes.add(r);
        List<Ingredient> tempList = r.getIngredients();
        for(int i = 0;  i < tempList.size(); i++) {
            if (this.ingredients.containsKey(tempList.get(i))) {
                int currentLikes = ingredients.get(tempList.get(i));
                currentLikes++;
                this.ingredients.remove(tempList.get(i));
                this.ingredients.put(tempList.get(i),currentLikes);
            } else {
                this.ingredients.put(tempList.get(i),1);
            }
        }
    }

    public List<Recipe> getPriorityList() {
        HashMap<Integer,Recipe> finalMap = new HashMap<>();
        List<Integer> scoreList = new ArrayList<>();
        List<Recipe> finalRecipes = Community.allRecipes;
        List<Recipe> answer = new ArrayList<>();
        for (int i = 0; i <finalRecipes.size(); i++) {
            int score = getScore(finalRecipes.get(i).ingredients);
            finalMap.put(score, finalRecipes.get(i));
            scoreList.add(score);
        }
        for(int i = 0; i < 3 & i<finalMap.size(); i++) {
            int highestIndex = Collections.max(scoreList);
        //    int highestScore = scoreList.get(highestIndex);
            Recipe tempRecipe = finalMap.get(highestIndex);
            answer.add(tempRecipe);
            scoreList.removeAll(Arrays.asList(highestIndex));
    }
        return answer;

    }

    public int getScore (List<Ingredient> ingredientList) {
        int score = 0;
        for(int i = 0; i < ingredientList.size(); i++) {
            Ingredient tempIn = ingredientList.get(i);
            if(this.ingredients.containsKey(tempIn)){
                int temp = this.ingredients.get(tempIn);
                score += temp;
            }
        }

        return score;




    }
    public void addRecipe(String name, Drawable image, String description) {
        Recipe recipe = new Recipe(name,image,description,User.this);
        Community.allRecipes.add(recipe);
        this.ownRecipes.add(recipe);
    }

    public void likeRecipe (Recipe r) {
        int index = Community.allRecipes.indexOf(r);
        Community.allRecipes.get(index).addLike();
        addToLikedRecipes(r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                height == user.height &&
                weight == user.weight &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email) &&
                diet == user.diet &&
                Objects.equals(likedRecipes, user.likedRecipes) &&
                Objects.equals(ownRecipes, user.ownRecipes) &&
                Objects.equals(tracker, user.tracker) &&
                Objects.equals(ingredients, user.ingredients);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, email, height, weight, diet, likedRecipes, ownRecipes, tracker, ingredients);
    }
}
