package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Bags {

  private final List<String> backpack = new ArrayList<>();

  public void addToBackpack(String item) {
    backpack.add(item);
  }

  public List<String> getBackpack() {
    return backpack;
  }
}
