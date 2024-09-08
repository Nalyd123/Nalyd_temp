package com.comp301.a01sushi;

public abstract class SuperIngredientPortion implements IngredientPortion{
    private final double amount;
    private final Ingredient nameIngredient;

    public SuperIngredientPortion(double amount, Ingredient nameIngredient) {
        if(amount<0){throw new IllegalArgumentException("Amount cannot be negative");}
        this.amount = amount;
        this.nameIngredient = nameIngredient;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Ingredient getIngredient() {
        return nameIngredient;
    }

    @Override
    public boolean getIsVegetarian(){
        return nameIngredient.getIsVegetarian();
    }

    @Override
    public boolean getIsRice(){
        return nameIngredient.getIsRice();
    }

    @Override
    public boolean getIsShellfish(){
        return nameIngredient.getIsShellfish();
    }

    @Override
    public String getName() {
        return nameIngredient.getName();
    }

    @Override
    public Ingredient getNameIngredient() {
        return nameIngredient;
    }
    @Override
    public double getCalories(){
        return amount*nameIngredient.getCaloriesPerOunce();
    }
    @Override
    public double getCost(){
        return amount*nameIngredient.getPricePerOunce();
    }



    @Override
    public IngredientPortion combine(IngredientPortion other){
        if(other==null){return this;}
        else if(other.getIngredient().getName().equals(this.getIngredient().getName()))
        {return createNewPortion(this.amount + other.getAmount());}
        else{return this;}

    }
    public abstract IngredientPortion createNewPortion(double amount);
}


