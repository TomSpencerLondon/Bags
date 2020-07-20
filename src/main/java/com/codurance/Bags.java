package com.codurance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bags {

  private final List<String> backpack;

  public Bags() {
    backpack = new ArrayList<String>();
  }

  public void addToBackpack(String item) {
    backpack.add(item);
  }

  public List<String> getBackpack() {
    return backpack;
  }
}
