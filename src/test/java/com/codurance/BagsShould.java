package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BagsShould {
  private final Bags bags = new Bags();

  @Test
  void add_8_items_to_the_backpack() {
    fillBackpack();
    assertEquals(8, bags.getBackpack().size());
  }

  @Test
  void place_9th_item_in_a_new_bag() {
    fillBackpack();

    bags.add(new Item("Seaweed", Category.HERB));

    assertEquals(8, bags.getBackpack().size());
    assertEquals(1, bags.getHerbBag().size());
  }

  @Test
  void place_additional_items_in_the_right_bag() {
    fillBackpack();
    bags.add(new Item("Linen", Category.CLOTHES));
    bags.add(new Item("Silver", Category.METAL));
    bags.add(new Item("Axe", Category.WEAPON));
    bags.add(new Item("Cherry Blossom", Category.HERB));

    assertEquals(8, bags.getBackpack().size());
    assertEquals(1, bags.getClothesBag().size());
    assertEquals(1, bags.getMetalBag().size());
    assertEquals(1, bags.getWeaponBag().size());
    assertEquals(1, bags.getHerbBag().size());
  }

  private void fillBackpack() {
    bags.add(new Item("Leather", Category.CLOTHES));
    bags.add(new Item("Iron", Category.HERB));
    bags.add(new Item("Copper", Category.METAL));
    bags.add(new Item("Marigold", Category.HERB));
    bags.add(new Item("Wool", Category.HERB));
    bags.add(new Item("Gold", Category.METAL));
    bags.add(new Item("Silk", Category.CLOTHES));
    bags.add(new Item("Copper", Category.METAL));
  }
}
