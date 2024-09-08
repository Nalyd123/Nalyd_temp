package com.comp301.a01sushi;

public class RicePortion extends SuperIngredientPortion {
    public RicePortion(double amount) {
        super(amount, new Rice());
    }
    public IngredientPortion createNewPortion(double amount) {
        return new RicePortion(amount);}
}
