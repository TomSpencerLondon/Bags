package com.codurance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bags {

  private final List<Item> backpack = new ArrayList<>();
  private List<Item> herbBag = new ArrayList<>();

  public void addToBackpack(Item item) {
    if (backpack.size() < 8) {
      backpack.add(item);
    } else {
      herbBag.add(item);
    }

  }

  public List<Item> getBackpack() {
    return backpack;
  }

  public Collection<Item> getHerbBag() {
    return herbBag;
  }
}
