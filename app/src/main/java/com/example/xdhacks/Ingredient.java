package com.example.xdhacks;

import android.annotation.TargetApi;

import java.util.Objects;
@TargetApi(19)
public class Ingredient {

    private String name;
    private int calCount;

    public Ingredient(String name, int calCount) {
        this.name = name;
        this.calCount = calCount;
    }

    public int getCalCount() {
        return calCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return calCount == that.calCount &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, calCount);
    }

}
