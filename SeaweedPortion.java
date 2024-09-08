package com.comp301.a01sushi;

public class SeaweedPortion extends SuperIngredientPortion {
    public SeaweedPortion(double amount) {
        super(amount, new Seaweed());
    }
    public IngredientPortion createNewPortion(double amount) {
        return new SeaweedPortion(amount);}
}