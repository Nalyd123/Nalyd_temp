package com.comp301.a01sushi;

public class AvocadoPortion extends SuperIngredientPortion{
    public AvocadoPortion(double amount) {
        super(amount, new Avocado());
    }
    public IngredientPortion createNewPortion(double amount) {
        return new AvocadoPortion(amount);}
}