package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BagsShould {

  private final Bags bags = new Bags();

  @Test
  void add_8_items_to_the_backpack() {
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

  @Test
  void place_9th_item_in_a_new_bag() {
    bags.addToBackpack(new Item("Leather", Category.CLOTHES));
    bags.addToBackpack(new Item("Iron", Category.HERB));
    bags.addToBackpack(new Item("Copper", Category.METAL));
    bags.addToBackpack(new Item("Marigold", Category.HERB));
    bags.addToBackpack(new Item("Wool", Category.HERB));
    bags.addToBackpack(new Item("Gold", Category.METAL));
    bags.addToBackpack(new Item("Silk", Category.CLOTHES));
    bags.addToBackpack(new Item("Copper", Category.METAL));

    bags.addToBackpack(new Item("Seaweed", Category.HERB));

    assertEquals(8, bags.getBackpack().size());
    assertEquals(1, bags.getHerbBag().size());
  }
}
