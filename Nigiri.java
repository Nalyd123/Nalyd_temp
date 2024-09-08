package com.comp301.a01sushi;

public class Nigiri implements Sushi{
    private final String kind;
    private final IngredientPortion Rice;
    private final IngredientPortion Meat;

  public Nigiri(String kind1) {
    this.kind = kind1;
    this.Rice = new RicePortion(0.5);

    switch (this.kind) {
      case "TUNA": this.Meat=new TunaPortion(0.75); break;
        case "YELLOWTAIL": this.Meat=new YellowtailPortion(0.75); break;
        case "EEL": this.Meat=new EelPortion(0.75); break;
        case "CRAB": this.Meat=new CrabPortion(0.75); break;
        case "SHRIMP": this.Meat=new ShrimpPortion(0.75); break;
        default: throw new IllegalArgumentException("Invalid kind: " + this.kind);
    }
    }

    @Override
    public String getName() {
      return Meat.getIngredient().getName() + " nigiri";
      }

      @Override
    public IngredientPortion[] getIngredients(){
    return new IngredientPortion[]{Meat,Rice};
      }

      @Override
    public double getCost(){
      return Rice.getCost()+Meat.getCost();
      }

      @Override
    public double getCalories(){
      return Rice.getCalories()+Meat.getCalories();
      }

      @Override
    public boolean getHasRice(){
      return true;
      }

      @Override
    public boolean getHasShellfish(){
      return Meat.getIsShellfish();
      }

      @Override
    public boolean getIsVegetarian(){
      return Meat.getIsVegetarian();
      }




}
