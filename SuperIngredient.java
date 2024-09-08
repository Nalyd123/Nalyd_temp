package com.comp301.a01sushi;

import static java.lang.Math.abs;

public abstract class SuperIngredient implements Ingredient{
  private String name;
  private double pricePerOunce;
  private int caloriePerOunce;
  private boolean isVegan;
  private boolean hasRice;
  private boolean hasShell;

  public SuperIngredient(String name1, double price1, int calorie1, boolean isVegan1, boolean hasRice1, boolean hasShell1) {
      this.name=name1;
      this.pricePerOunce=price1;
      this.caloriePerOunce=calorie1;
      this.isVegan=isVegan1;
      this.hasRice=hasRice1;
      this.hasShell=hasShell1;
    }


    @Override
    public String getName() {
      return name;
    }
    @Override
    public double getPricePerOunce() {
      return pricePerOunce;
    }

    @Override
    public int getCaloriesPerOunce() {
      return caloriePerOunce;
    }
    @Override
    public boolean getIsVegetarian() {
      return isVegan;
    }
    @Override
    public boolean getIsRice() {
      return hasRice;
    }
    @Override
    public boolean getIsShellfish() {
      return hasShell;
    }
    @Override
    public boolean equals(Ingredient other){
    if(other==null){return false;}
        return other.getName().equals(this.getName())
                && abs(other.getPricePerOunce() - this.getPricePerOunce())<0.001
                && other.getIsRice() == this.getIsRice()
                && abs(this.getCaloriesPerOunce() - other.getCaloriesPerOunce())<0.001
                && this.getIsShellfish() == other.getIsShellfish()
                && this.getIsVegetarian() == other.getIsVegetarian();
    }

  @Override
  public double getCaloriesPerDollar(){
    return caloriePerOunce/pricePerOunce;
  }
}
