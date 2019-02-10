package com.example.xdhacks;

import com.example.xdhacks.Ingredient;
import com.example.xdhacks.Recipe;
import com.example.xdhacks.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Community {
    public static List<Recipe> allRecipes;
    public static List<User> allUsers;
    public static List<Ingredient> allIngredients;

    public Community() {
        allRecipes = new ArrayList<>();
        allUsers = new ArrayList<>();
        allIngredients = new ArrayList<>();
    }

    public static List<Recipe> trendingRecipes() {
        List<Recipe> finalRecipes = new ArrayList<>();
        List<Integer> highestLikes = new ArrayList<>();
        for(int i = 0; i < Community.allRecipes.size(); i++) {
            if(highestLikes.size() <= 6) {
                highestLikes.add(Community.allRecipes.get(i).getLikeCount());
            } else {
                int index = Collections.min(highestLikes);
                int minSoFar = highestLikes.get(index);
                if (Community.allRecipes.get(i).getLikeCount() > minSoFar ) {
                    highestLikes.remove(index);
                    highestLikes.add(Community.allRecipes.get(i).getLikeCount());
                }

            }
        }
        for (int i = 0; i < 7; i++) {
            for(int j = 0; j < Community.allRecipes.size(); j++) {
                if (Community.allRecipes.get(j).getLikeCount() == highestLikes.get(0)) {
                    finalRecipes.add(Community.allRecipes.get(j));
                    break;
                }
            }
        }
        return finalRecipes;
    }

    public static List<Recipe> filter(Diet d) {
        List<Recipe> finalList = new ArrayList<>();
        List<Recipe> filteredList = new ArrayList<>();
        List<Recipe> bigList = Community.allRecipes;
        for (int i = 0; i < Community.allRecipes.size(); i++) {
            if (d == bigList.get(i).getDiet()) {
                filteredList.add(bigList.get(i));
            }
        }
        List<Integer> highestLikes = new ArrayList<>();
        for(int i = 0; i < filteredList.size(); i++) {
            if(highestLikes.size() <= 10) {
                highestLikes.add(filteredList.get(i).getLikeCount());
            } else {
                int index = Collections.min(highestLikes);
                int minSoFar = highestLikes.get(index);
                if (filteredList.get(i).getLikeCount() > minSoFar ) {
                    highestLikes.remove(index);
                    highestLikes.add(filteredList.get(i).getLikeCount());
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for(int j = 0; j < filteredList.size(); j++) {
                if (filteredList.get(j).getLikeCount() == highestLikes.get(0)) {
                   finalList.add(Community.allRecipes.get(j));
                    break;
                }
            }
        }


        return filteredList;
    }

}
