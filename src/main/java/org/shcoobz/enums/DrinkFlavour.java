package org.shcoobz.enums;

// Enum representing different flavors of drinks with associated prices.
public enum DrinkFlavour {
  COCA_COLA(1.50),
  FANTA(1.50),
  ICE_TEA(1.75);

  private final double price; // price of drink flavor

  DrinkFlavour(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }
}
