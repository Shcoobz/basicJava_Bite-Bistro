package org.shcoobz.model;

import org.shcoobz.enums.Ingredient;

import java.util.ArrayList;
import java.util.List;

// Represents a sandwich as an order item.

public class Sandwich implements OrderItem {
  private List<Ingredient> ingredients;
  private String name; // could be done with setter

  // constructor
  public Sandwich(String name) {
    this.name = name;
    this.ingredients = new ArrayList<>();
  }

  // constructor without a name
  public Sandwich() {
    this("Custom Sandwich");
    // default name
    // constructor chaining.
    // more versatile, can help ensure consistent initialization across different constructors
  }

  public void addIngredient(Ingredient ingredient) {
    ingredients.add(ingredient);
  }

  @Override
  public double getPrice() {
    double total = 0;

    for (Ingredient ingredient : ingredients) {
      total += ingredient.getPrice();
    }
    return total;
  }

  @Override
  public String getName() {
    return name != null ? name : "Custom Sandwich";
  }
}
