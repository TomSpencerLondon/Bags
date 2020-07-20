package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BagsShould {

  @Test
  void add_8_items_to_the_backpack() {
    Bags bags = new Bags();
    bags.addToBackpack("Leather");
    bags.addToBackpack("Iron");
    bags.addToBackpack("Copper");
    bags.addToBackpack("Marigold");
    bags.addToBackpack("Wool");
    bags.addToBackpack("Gold");
    bags.addToBackpack("Silk");
    bags.addToBackpack("Copper");

    assertEquals(8, bags.getBackpack().size());
  }
}
