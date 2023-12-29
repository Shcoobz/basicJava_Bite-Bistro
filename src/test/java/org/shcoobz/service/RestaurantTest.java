package org.shcoobz.service;

import org.shcoobz.enums.DrinkFlavour;
import org.shcoobz.enums.Ingredient;
import org.shcoobz.model.Drink;
import org.shcoobz.model.Sandwich;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

  private Restaurant restaurant;

  @BeforeEach
  void setUp() {
    restaurant = new Restaurant("TestSubway");
  }

  @Test
  void testAddOrderAndCalculateIncome() {
    Drink coke = new Drink(DrinkFlavour.COCA_COLA);
    Sandwich sandwich = new Sandwich();
    sandwich.addIngredient(Ingredient.CHEESE);

    restaurant.addOrder(coke);
    restaurant.addOrder(sandwich);

    double expectedIncome = DrinkFlavour.COCA_COLA.getPrice() + Ingredient.CHEESE.getPrice();
    assertEquals(expectedIncome, restaurant.calculateIncome());
  }
}
