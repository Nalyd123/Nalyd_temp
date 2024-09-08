package com.comp301.a01sushi;

public class ShrimpPortion extends SuperIngredientPortion {
    public ShrimpPortion(double amount) {
        super(amount, new Shrimp());
    }
    public IngredientPortion createNewPortion(double amount) {
        return new ShrimpPortion(amount);}
}