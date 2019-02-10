package com.example.xdhacks;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void addRecipesTest() {
        Community community = new Community();
        Ingredient newI = new Ingredient("sauce",30);
        Ingredient newJ = new Ingredient("saucy",30);
        Tracker t = new Tracker(null,null,0,0);
        User user = new User("yo",20,"ssss",4,7,Diet.VEGAN,t);
        Recipe test = new Recipe("really good",null,"a really good recipe",user);
        test.addIngredients(newI);
        test.addIngredients(newJ);
        Ingredient newK = new Ingredient("sauce",30);
        Ingredient newL = new Ingredient("saucy",30);
        Tracker t1 = new Tracker(null,null,0,0);
        Recipe test1 = new Recipe("really good",null,"a really good recipe",user);
        test1.addIngredients(newI);
        test1.addIngredients(newJ);
        user.addRecipe("very good",null,"wohooo");
        Assert.assertEquals(1,Community.allRecipes.size());
        Assert.assertTrue(user.ownRecipes.size() == 1);
    }

    @Test
    public void addLikedTest() {
        Community community = new Community();
        Ingredient newI = new Ingredient("sauce",30);
        Ingredient newJ = new Ingredient("saucy",30);
        Tracker t = new Tracker(null,null,0,0);
        User user = new User("yo",20,"ssss",4,7,Diet.VEGAN,t);
        Recipe test = new Recipe("really good",null,"a really good recipe",user);
        test.addIngredients(newI);
        test.addIngredients(newJ);
        Ingredient newK = new Ingredient("sauce",30);
        Ingredient newL = new Ingredient("saucy",40);
        Recipe test1 = new Recipe("really gooddd",null,"a really good recipe",user);
        test1.addIngredients(newK);
        test1.addIngredients(newL);
        Ingredient newM = new Ingredient("sauce",30);
        Ingredient newN = new Ingredient("what a good ingredient",30);
        Recipe test2 = new Recipe("really",null,"a really  great recipe",user);
        test2.addIngredients(newM);
        test2.addIngredients(newN);
        Community.allRecipes.add(test);
        Community.allRecipes.add(test1);
        Community.allRecipes.add(test2);
        user.likeRecipe(test1);
        user.likeRecipe(test2);
        Assert.assertEquals(1,Community.allRecipes.get(1).getLikeCount());
        Assert.assertEquals(2,user.likedRecipes.size());
        int temp = user.ingredients.get(newN);
        Assert.assertEquals(1,temp);
        int temp2 = user.ingredients.get(newK);
        Assert.assertEquals(2,temp2);


    }
    @Test
    public void GetPriorityListTest() {
        Community community = new Community();
        Ingredient newI = new Ingredient("sauce", 30);
        Ingredient newJ = new Ingredient("eggs", 30);
        Tracker t = new Tracker(null, null, 0, 0);
        User user = new User("yo", 20, "ssss", 4, 7, Diet.VEGAN, t);
        Recipe test = new Recipe("really good", null, "a really good recipe", user);
        test.addIngredients(newI);
        test.addIngredients(newJ);
        Ingredient newK = new Ingredient("sauce", 30);
        Ingredient newL = new Ingredient("pancakes", 40);
        Recipe test1 = new Recipe("really gooddd", null, "a really good recipe", user);
        test1.addIngredients(newK);
        test1.addIngredients(newL);
        Ingredient newM = new Ingredient("sauce", 30);
        Ingredient newN = new Ingredient("syrup", 30);
        Recipe test2 = new Recipe("really", null, "a really  great recipe", user);
        test2.addIngredients(newM);
        test2.addIngredients(newN);
        Ingredient newO = new Ingredient("eggs", 30);
        Ingredient newP = new Ingredient("sugar", 30);
        Recipe test3 = new Recipe("really", null, "a really  great recipe", user);
        test2.addIngredients(newO);
        test2.addIngredients(newP);
        Ingredient newQ = new Ingredient("sauce", 30);
        Ingredient newR = new Ingredient("sugar", 30);
        Recipe test4 = new Recipe("really", null, "a really  great recipe", user);
        test4.addIngredients(newQ);
        test4.addIngredients(newR);
        Ingredient newS = new Ingredient("sauce", 30);
        Ingredient newT = new Ingredient("chicken", 30);
        Recipe test5 = new Recipe("really", null, "a really  great recipe", user);
        test5.addIngredients(newS);
        test5.addIngredients(newT);
        Ingredient newU = new Ingredient("no", 30);
        Ingredient newV = new Ingredient("not at all", 30);
        Recipe test6 = new Recipe("really", null, "a really  great recipe", user);
        test6.addIngredients(newU);
        test6.addIngredients(newV);
        Community.allRecipes.add(test);
        Community.allRecipes.add(test1);
        Community.allRecipes.add(test2);
        Community.allRecipes.add(test3);
        Community.allRecipes.add(test4);
        Community.allRecipes.add(test5);
        Community.allRecipes.add(test6);

        user.likeRecipe(test1);
        user.likeRecipe(test2);
        user.likeRecipe(test5);
        Assert.assertEquals(3,user.getPriorityList().size());
        Assert.assertEquals(6,user.getScore(user.getPriorityList().get(0).getIngredients()));
        Assert.assertEquals(4,user.getScore(user.getPriorityList().get(1).getIngredients()));
        Assert.assertEquals(0,user.getScore(user.getPriorityList().get(2).getIngredients()));

    }


}
