package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Bags {

  private final List<Item> backpack = new ArrayList<>();

  public void addToBackpack(Item item) {
    backpack.add(item);
  }

  public List<Item> getBackpack() {
    return backpack;
  }

}
