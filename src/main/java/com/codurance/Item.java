package com.codurance;

public class Item {

  private final String name;
  private final Category category;

  public Item(String name, Category category) {
    this.name = name;
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public Category getCategory() {
    return category;
  }
}
