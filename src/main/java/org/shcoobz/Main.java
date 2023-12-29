package org.shcoobz;

import org.shcoobz.enums.DrinkFlavour;
import org.shcoobz.model.Drink;
import org.shcoobz.enums.Ingredient;
import org.shcoobz.model.Sandwich;
import org.shcoobz.service.Restaurant;

public class Main {
  public static void main(String[] args) {
    Restaurant subway = new Restaurant("Subway");

    Drink coke = new Drink(DrinkFlavour.COCA_COLA);
    Drink fanta = new Drink(DrinkFlavour.FANTA);
    Drink iceTea = new Drink(DrinkFlavour.ICE_TEA);

    Sandwich sandwich = new Sandwich();
    sandwich.addIngredient(Ingredient.CHEESE);
    sandwich.addIngredient(Ingredient.SALAT);

    Sandwich sandwichSpecial = new Sandwich("Special Sandwich");
    sandwichSpecial.addIngredient(Ingredient.CHEESE);
    sandwichSpecial.addIngredient(Ingredient.SALAT);
    sandwichSpecial.addIngredient(Ingredient.SPECIAL);

    subway.addOrder(coke);
    subway.addOrder(fanta);
    subway.addOrder(iceTea);

    subway.addOrder(sandwich);
    subway.addOrder(sandwichSpecial);

    System.out.println("\nWelcome to " + subway.getName() + " !");
    System.out.println("\nYour order:");
    subway.printOrders();
    System.out.println("\nTotal: " + String.format("%,.2f", subway.calculateIncome()) + " bananas");
  }
}