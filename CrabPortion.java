package com.comp301.a01sushi;

public class CrabPortion extends SuperIngredientPortion {
    public CrabPortion(double amount) {
        super(amount, new Crab());
    }
    public IngredientPortion createNewPortion(double amount) {
        return new CrabPortion(amount);}
}

