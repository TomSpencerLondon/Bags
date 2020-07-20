package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BagsShould {

  @Test
  void add_8_items_to_the_backpack() {
    Bags bags = new Bags();
    bags.addToBackpack(new Item("Leather", Category.CLOTHES));
    bags.addToBackpack(new Item("Iron", Category.HERB));
    bags.addToBackpack(new Item("Copper", Category.METAL));
    bags.addToBackpack(new Item("Marigold", Category.HERB));
    bags.addToBackpack(new Item("Wool", Category.HERB));
    bags.addToBackpack(new Item("Gold", Category.METAL));
    bags.addToBackpack(new Item("Silk", Category.CLOTHES));
    bags.addToBackpack(new Item("Copper", Category.METAL));

    assertEquals(8, bags.getBackpack().size());
  }
}
