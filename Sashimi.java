package com.comp301.a01sushi;

public class Sashimi implements Sushi {

    private final String kind;
    private final IngredientPortion portion1;

    public Sashimi(String kind1){
        this.kind =kind1;
        switch(this.kind){
            case "TUNA":
                this.portion1=new TunaPortion(0.75);
                break;
            case "YELLOWTAIL":
                this.portion1=new YellowtailPortion(0.75);
                break;

            case "EEL":
                this.portion1=new EelPortion(0.75);
                break;

            case "CRAB":
                this.portion1=new CrabPortion(0.75);
                break;

            case "Shrimp":
                this.portion1=new ShrimpPortion(0.75);
                break;
            default:
                throw new IllegalArgumentException("Invalid portion type");
    }
    }

    @Override
    public String getName(){
        return portion1.getIngredient().getName()+"Sashimi";
    }

    @Override
    public IngredientPortion[] getIngredients() {
        return new IngredientPortion[]{portion1};
    }

    @Override
    public double getCost(){
        return portion1.getCost();
    }

    @Override
    public double getCalories(){
        return portion1.getCalories();
    }

    @Override
    public boolean getHasRice(){
        return portion1.getIsRice();
    }

    @Override
    public boolean getHasShellfish(){
        return portion1.getIsShellfish();
    }

    @Override
    public boolean getIsVegetarian(){
        return portion1.getIsVegetarian();
    }
}


