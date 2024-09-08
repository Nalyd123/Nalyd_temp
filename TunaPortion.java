package com.comp301.a01sushi;

public class TunaPortion extends SuperIngredientPortion {
    public TunaPortion(double amount) {
        super(amount, new Tuna());
    }
    public IngredientPortion createNewPortion(double amount) {
        return new TunaPortion(amount);}
}