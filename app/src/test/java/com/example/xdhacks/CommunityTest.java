package com.example.xdhacks;

import android.graphics.drawable.Drawable;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CommunityTest {

    @Test
    public void trendingRecipesTest() {
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
        user.likeRecipe(test);
        user.likeRecipe(test2);
        user.likeRecipe(test3);
        user.likeRecipe(test4);
        user.likeRecipe(test5);
        user.likeRecipe(test6);
        user.likeRecipe(test2);
        Assert.assertEquals(6,Community.trendingRecipes().size());
        Assert.assertEquals(test2,Community.allRecipes.get(2));
        Assert.assertTrue(!Community.trendingRecipes().contains(test1));
    }

    @Test
    public void filterTestOverTen() {
        Community community = new Community();
        Ingredient newI = new Ingredient("sauce", 30);
        Ingredient newJ = new Ingredient("eggs", 30);
        Tracker t = new Tracker(null, null, 0, 0);
        User user = new User("yo", 20, "ssss", 4, 7, Diet.VEGAN, t);
        Recipe test = new Recipe("really good", null, "a really good recipe", user);
        test.addIngredients(newI);
        test.addIngredients(newJ);
        test.setDiet(Diet.VEGAN);
        Ingredient newK = new Ingredient("sauce", 30);
        Ingredient newL = new Ingredient("pancakes", 40);
        Recipe test1 = new Recipe("really gooddd", null, "a really good recipe", user);
        test1.addIngredients(newK);
        test1.addIngredients(newL);
        test1.setDiet(Diet.VEGAN);
        Ingredient newM = new Ingredient("sauce", 30);
        Ingredient newN = new Ingredient("syrup", 30);
        Recipe test2 = new Recipe("really", null, "a really  great recipe", user);
        test2.addIngredients(newM);
        test2.addIngredients(newN);
        test2.setDiet(Diet.VEGAN);
        Ingredient newO = new Ingredient("eggs", 30);
        Ingredient newP = new Ingredient("sugar", 30);
        Recipe test3 = new Recipe("really", null, "a really  great recipe", user);
        test3.addIngredients(newO);
        test3.addIngredients(newP);
        test3.setDiet(Diet.VEGAN);
        Ingredient newQ = new Ingredient("sauce", 30);
        Ingredient newR = new Ingredient("sugar", 30);
        Recipe test4 = new Recipe("really", null, "a really  great recipe", user);
        test4.addIngredients(newQ);
        test4.addIngredients(newR);
        test4.setDiet(Diet.VEGAN);
        Ingredient newS = new Ingredient("sauce", 30);
        Ingredient newT = new Ingredient("chicken", 30);
        Recipe test5 = new Recipe("really", null, "a really  great recipe", user);
        test5.addIngredients(newS);
        test5.addIngredients(newT);
        test5.setDiet(Diet.VEGAN);
        Ingredient newU = new Ingredient("no", 30);
        Ingredient newV = new Ingredient("not at all", 30);
        Recipe test6 = new Recipe("really", null, "a really  great recipe", user);
        test6.addIngredients(newU);
        test6.addIngredients(newV);
        test6.setDiet(Diet.VEGAN);
        Ingredient newX = new Ingredient("peppers", 10);
        Ingredient newY = new Ingredient("salt", 40);
        Recipe test7 = new Recipe("pepper salt", null, "a really  great recipe", user);
        test7.addIngredients(newX);
        test7.addIngredients(newY);
        test7.setDiet(Diet.ALL_AROUND);
        Ingredient newZ = new Ingredient("grains", 20);
        Ingredient newA = new Ingredient("sand", 10);
        Recipe test8 = new Recipe("grainy grass", null, "a really  great recipe", user);
        test8.addIngredients(newZ);
        test8.addIngredients(newA);
        test8.setDiet(Diet.VEGAN);
        Ingredient newB = new Ingredient("rice", 20);
        Ingredient newC = new Ingredient("beef", 100);
        Recipe test9 = new Recipe("beef rice", null, "a really  great recipe", user);
        test9.addIngredients(newB);
        test9.addIngredients(newC);
        test9.setDiet(Diet.VEGAN);
        Ingredient newD = new Ingredient("rice", 20);
        Ingredient newE = new Ingredient("beef", 100);
        Recipe test10 = new Recipe("beef rice", null, "a really  great recipe", user);
        test10.addIngredients(newD);
        test10.addIngredients(newE);
        test10.setDiet(Diet.VEGAN);
        Community.allRecipes.add(test);
        Community.allRecipes.add(test1);
        Community.allRecipes.add(test2);
        Community.allRecipes.add(test3);
        Community.allRecipes.add(test4);
        Community.allRecipes.add(test5);
        Community.allRecipes.add(test6);
        Community.allRecipes.add(test7);
        Community.allRecipes.add(test8);
        Community.allRecipes.add(test9);
        Community.allRecipes.add(test10);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test2);
        user.likeRecipe(test2);
        user.likeRecipe(test2);
        user.likeRecipe(test2);
        user.likeRecipe(test4);
        user.likeRecipe(test5);
        user.likeRecipe(test5);

        Assert.assertEquals(10,Community.filter(Diet.VEGAN).size());
        Assert.assertEquals(test1,Community.filter(Diet.VEGAN).get(0));
        Assert.assertEquals(test2,Community.filter(Diet.VEGAN).get(1));
        Assert.assertEquals(test5,Community.filter(Diet.VEGAN).get(2));
        Assert.assertEquals(test4,Community.filter(Diet.VEGAN).get(3));
        Assert.assertTrue(!Community.filter(Diet.VEGAN).contains(test7));



    }

    @Test
    public void filterTestUnderTen() {
        Community community = new Community();
        Ingredient newI = new Ingredient("sauce", 30);
        Ingredient newJ = new Ingredient("eggs", 30);
        Tracker t = new Tracker(null, null, 0, 0);
        User user = new User("yo", 20, "ssss", 4, 7, Diet.VEGAN, t);
        Recipe test = new Recipe("really good", null, "a really good recipe", user);
        test.addIngredients(newI);
        test.addIngredients(newJ);
        test.setDiet(Diet.VEGAN);
        Ingredient newK = new Ingredient("sauce", 30);
        Ingredient newL = new Ingredient("pancakes", 40);
        Recipe test1 = new Recipe("really gooddd", null, "a really good recipe", user);
        test1.addIngredients(newK);
        test1.addIngredients(newL);
        test1.setDiet(Diet.VEGAN);
        Ingredient newM = new Ingredient("sauce", 30);
        Ingredient newN = new Ingredient("syrup", 30);
        Recipe test2 = new Recipe("really", null, "a really  great recipe", user);
        test2.addIngredients(newM);
        test2.addIngredients(newN);
        test2.setDiet(Diet.VEGAN);
        Ingredient newO = new Ingredient("eggs", 30);
        Ingredient newP = new Ingredient("sugar", 30);
        Recipe test3 = new Recipe("really", null, "a really  great recipe", user);
        test3.addIngredients(newO);
        test3.addIngredients(newP);
        test3.setDiet(Diet.VEGAN);
        Ingredient newQ = new Ingredient("sauce", 30);
        Ingredient newR = new Ingredient("sugar", 30);
        Recipe test4 = new Recipe("really", null, "a really  great recipe", user);
        test4.addIngredients(newQ);
        test4.addIngredients(newR);
        test4.setDiet(Diet.VEGAN);
        Ingredient newS = new Ingredient("sauce", 30);
        Ingredient newT = new Ingredient("chicken", 30);
        Recipe test5 = new Recipe("really", null, "a really  great recipe", user);
        test5.addIngredients(newS);
        test5.addIngredients(newT);
        test5.setDiet(Diet.VEGAN);
        Ingredient newU = new Ingredient("no", 30);
        Ingredient newV = new Ingredient("not at all", 30);
        Recipe test6 = new Recipe("really", null, "a really  great recipe", user);
        test6.addIngredients(newU);
        test6.addIngredients(newV);
        test6.setDiet(Diet.VEGAN);
        Ingredient newX = new Ingredient("peppers", 10);
        Ingredient newY = new Ingredient("salt", 40);
        Recipe test7 = new Recipe("pepper salt", null, "a really  great recipe", user);
        test7.addIngredients(newX);
        test7.addIngredients(newY);
        test7.setDiet(Diet.ALL_AROUND);
        Ingredient newZ = new Ingredient("grains", 20);
        Ingredient newA = new Ingredient("sand", 10);
        Recipe test8 = new Recipe("grainy grass", null, "a really  great recipe", user);
        test8.addIngredients(newZ);
        test8.addIngredients(newA);
        test8.setDiet(Diet.VEGAN);
        Ingredient newB = new Ingredient("rice", 20);
        Ingredient newC = new Ingredient("beef", 100);
        Recipe test9 = new Recipe("beef rice", null, "a really  great recipe", user);
        test9.addIngredients(newB);
        test9.addIngredients(newC);
        test9.setDiet(Diet.VEGAN);
        Ingredient newD = new Ingredient("rice", 20);
        Ingredient newE = new Ingredient("beef", 100);
        Recipe test10 = new Recipe("beef rice", null, "a really  great recipe", user);
        test10.addIngredients(newD);
        test10.addIngredients(newE);
        test10.setDiet(Diet.VEGAN);
        Community.allRecipes.add(test);
        Community.allRecipes.add(test1);
        Community.allRecipes.add(test2);
        Community.allRecipes.add(test3);
        Community.allRecipes.add(test4);
        Community.allRecipes.add(test5);
        Community.allRecipes.add(test6);
        Community.allRecipes.add(test7);
        Community.allRecipes.add(test8);
        Community.allRecipes.add(test9);
        Community.allRecipes.add(test10);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test1);
        user.likeRecipe(test2);
        user.likeRecipe(test2);
        user.likeRecipe(test2);
        user.likeRecipe(test2);
        user.likeRecipe(test4);
        user.likeRecipe(test5);
        user.likeRecipe(test5);
        List<Recipe> filteredListFinal = Community.filter(Diet.ALL_AROUND);

        Assert.assertEquals(1,filteredListFinal.size());
        Assert.assertTrue(test7 == Community.filter(Diet.ALL_AROUND).get(0));
    }


}
