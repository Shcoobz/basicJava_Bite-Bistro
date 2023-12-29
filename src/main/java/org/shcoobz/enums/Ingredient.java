package org.shcoobz.enums;

// Enum representing different sandwich ingredients with associated prices.

public enum Ingredient {
  SALAT(0.50),
  CHEESE(1.00),
  TOMATO(0.30),
  SPECIAL (5.00);

  private final double price; // price of ingredient

  // constructor
  Ingredient(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }
}
