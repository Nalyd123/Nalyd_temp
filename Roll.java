package com.comp301.a01sushi;

import java.util.HashMap;
import java.util.Map;

public class Roll implements Sushi{
    private final String meatName;
    private final IngredientPortion[] ingredient;
    public Roll(String name, IngredientPortion[] roll_ingredients){
        if (name == null || roll_ingredients == null) {
            throw new IllegalArgumentException("Name or ingredients cannot be null");
        }

    for (IngredientPortion portion : roll_ingredients) {
        if (portion == null) {
            throw new IllegalArgumentException("Ingredient portion cannot be null");
        }
    }

    this.meatName=name;
    this.ingredient= seaweed(roll_ingredients);

    }
    private IngredientPortion[] seaweed(IngredientPortion[] portions) {
            Map<String, IngredientPortion> combined = new HashMap<>();
            for (IngredientPortion portion : portions) {
                String ingredientName= portion.getIngredient().getName();
                if (combined.containsKey(ingredientName)) {
                    combined.put(ingredientName, combined.get(ingredientName).combine(portion));
                }
                else{
                    combined.put(ingredientName,portion);
                }
        }

            if (combined.containsKey("seaweed")){
                SeaweedPortion seaweedAlready = (SeaweedPortion) combined.get("seaweed");
                if(seaweedAlready.getAmount()<0.1){
        combined.put("seaweed", new SeaweedPortion(0.1));
                }
        }
            else {combined.put("seaweed", new SeaweedPortion(0.1));}
            return combined.values().toArray(new IngredientPortion[0]);
    }


    @Override
    public String getName() {
        return meatName;
        }

        @Override
    public IngredientPortion[] getIngredients() {
        return ingredient.clone();
        }

        @Override
    public double getCalories(){
        double sum =0;
                for(IngredientPortion portion : ingredient){
                    sum+=portion.getCalories();
                }
        return sum;
        }

        @Override
    public double getCost(){
        double sum =0;
        for(IngredientPortion portion : ingredient){
            sum+=portion.getCost();
        }
        return sum;
        }

        @Override
    public boolean getIsVegetarian(){
        for(IngredientPortion portion : ingredient){
            if(!portion.getIngredient().getIsVegetarian()){
                return false;}
        }
        return true;
        }

        @Override
    public boolean getHasShellfish(){
        for(IngredientPortion portion : ingredient){
            if(portion.getIngredient().getIsShellfish()){
                return true;
            }
        }
        return false;
        }

        @Override
    public boolean getHasRice(){
        for(IngredientPortion portion : ingredient){
            if(portion.getIngredient().getIsRice()){
                return true;
            }
        }
        return false;
        }


}
