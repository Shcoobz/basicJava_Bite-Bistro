package org.shcoobz.service;

import org.shcoobz.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

// Represents a restaurant.

public class Restaurant {
  private String name;
  private List<OrderItem> orders; // list of orders

  public Restaurant(String name) {
    this.name = name;
    orders = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void addOrder(OrderItem item) {
    orders.add(item);
  }

  public double calculateIncome() {
    return orders.stream().mapToDouble(OrderItem::getPrice).sum();
  }

  public void printOrders() {
    orders.forEach(item -> System.out.println(item.getName() + ": " + String.format("%,.2f", item.getPrice()) + " bananas"));
  }
}
