package com.example.mealplanner.model;

/**
 * Created by Dan on 02/03/14.
 */
public class Meal {
    // Attributes
    private String mealName;

    // Constructors
    private Meal(){}

    // Factory methods
    public static Meal create(String mealName){
        Meal meal = new Meal();
        meal.setMealName(mealName);
        return meal;
    }

    // Accessors/Mutators
    public String getMealName(){
        return this.mealName;
    }
    public boolean setMealName(String name){
        boolean result = false;
        this.mealName = name;
        result = (this.mealName.equals(name));
        return result;
    }
}
