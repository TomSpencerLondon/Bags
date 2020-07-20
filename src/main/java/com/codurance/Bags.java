package com.codurance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.params.ParameterizedTest;

public class Bags {

  private List<Item> backpack = new ArrayList<>();
  private final List<Item> herbBag = new ArrayList<>();
  private final List<Item> clothesBag = new ArrayList<>();
  private final List<Item> weaponBag = new ArrayList<>();
  private final List<Item> metalBag = new ArrayList<>();

  public void add(Item item) {
    if (backpack.size() < 8) {
      backpack.add(item);
    } else {
      switch (item.getCategory()){
        case CLOTHES -> clothesBag.add(item);
        case METAL -> metalBag.add(item);
        case HERB -> herbBag.add(item);
        case WEAPON -> weaponBag.add(item);
      }
    }
  }

  public List<Item> getBackpack() {
    return List.copyOf(backpack);
  }

  public List<Item> getHerbBag() {
    return List.copyOf(herbBag);
  }

  public List<Item> getClothesBag() {
    return List.copyOf(clothesBag);
  }

  public List<Object> getMetalBag() {
    return List.copyOf(metalBag);
  }

  public List<Object> getWeaponBag() {
    return List.copyOf(weaponBag);
  }

  public void organise(){
    backpack = backpack.stream()
            .sorted(Comparator.comparing(Item::getName))
            .collect(Collectors.toList());
  }
}
