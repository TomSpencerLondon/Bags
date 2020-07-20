package com.codurance;

import static com.codurance.Category.BACKPACK;
import static com.codurance.Category.CLOTHES;
import static com.codurance.Category.HERB;
import static com.codurance.Category.METAL;
import static com.codurance.Category.WEAPON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Bags {
  Map<Category, List<Item>> bags = new EnumMap<>(Category.class);

  public Bags() {
    bags.put(BACKPACK, new ArrayList<>());
    bags.put(CLOTHES, new ArrayList<>());
    bags.put(METAL, new ArrayList<>());
    bags.put(HERB, new ArrayList<>());
    bags.put(WEAPON, new ArrayList<>());
  }

  public void add(Item item) {
    if (bags.get(BACKPACK).size() < 8) {
      bags.get(BACKPACK).add(item);
    } else {
      bags.get(item.getCategory()).add(item);
    }
  }

  public List<Item> getBackpack() {
    return List.copyOf(bags.get(BACKPACK));
  }

  public List<Item> getHerbBag() {
    return List.copyOf(bags.get(HERB));
  }

  public List<Item> getClothesBag() {
    return List.copyOf(bags.get(CLOTHES));
  }

  public List<Object> getMetalBag() {
    return List.copyOf(bags.get(METAL));
  }

  public List<Object> getWeaponBag() {
    return List.copyOf(bags.get(WEAPON));
  }

  public void organise(){
    bags.values().forEach(a -> Collections.sort(a, Comparator.comparing(Item::getName)));
  }
}
