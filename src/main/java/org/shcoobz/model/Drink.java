package org.shcoobz.model;

import org.shcoobz.enums.DrinkFlavour;

// Represents a drink as an order item.

public class Drink implements OrderItem {
  private DrinkFlavour flavour;

  public Drink(DrinkFlavour flavour) {
    this.flavour = flavour;
  }

  @Override
  public double getPrice() {
    return flavour.getPrice();
  }

  @Override
  public String getName() {
    return flavour.name().replace("_", " "); // replacing underscores with spaces
  }
}
