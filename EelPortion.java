package com.comp301.a01sushi;

public class EelPortion extends SuperIngredientPortion {
    public EelPortion(double amount) {
        super(amount, new Eel());
    }
    public IngredientPortion createNewPortion(double amount) {
        return new EelPortion(amount);}
}
