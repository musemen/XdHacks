package com.example.xdhacks;

import android.graphics.drawable.Drawable;

import org.junit.Assert;
import org.junit.Test;

public class RecipeTest {

    @Test
    public void constructorTest() {
        Community community = new Community();
        Tracker t = new Tracker(null,null,0,0);
        User user = new User("yo",20,"ssss",4,7,Diet.VEGAN,t);
        Recipe test = new Recipe("really good",null,"a really good recipe",user);
        Assert.assertEquals("really good",test.getName());
        Assert.assertEquals("a really good recipe",test.getDescription());

    }


    @Test
    public void addIngridientAndTotalTest() {
        Ingredient newI = new Ingredient("sauce",30);
        Ingredient newJ = new Ingredient("saucy",30);
        Tracker t = new Tracker(null,null,0,0);
        User user = new User("yo",20,"ssss",4,7,Diet.VEGAN,t);
        Recipe test = new Recipe("really good",null,"a really good recipe",user);
        test.addIngredients(newI);
        test.addIngredients(newJ);
        Assert.assertEquals(60,test.totalCalories());

    }

    @Test
    public void recipeEqualTrue() {
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
        Assert.assertEquals(test1,test);
    }

}
