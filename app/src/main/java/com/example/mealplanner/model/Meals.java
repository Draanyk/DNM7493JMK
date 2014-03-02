package com.example.mealplanner.model;

import java.util.ArrayList;

/**
 * Created by Dan on 02/03/14.
 */
public class Meals {


    public ArrayList<Meal> getAllMeals(){
        ArrayList<Meal> meals = new ArrayList<Meal>();

        meals.add(Meal.create("Peanut butter & jam sandwich"));
        meals.add(Meal.create("Fish and chips"));

        return meals;
    }
}
