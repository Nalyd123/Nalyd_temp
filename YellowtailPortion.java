package com.comp301.a01sushi;

public class YellowtailPortion extends SuperIngredientPortion {
    public YellowtailPortion(double amount) {
        super(amount, new Yellowtail());
    }
    public IngredientPortion createNewPortion(double amount) {
        return new YellowtailPortion(amount);}
}