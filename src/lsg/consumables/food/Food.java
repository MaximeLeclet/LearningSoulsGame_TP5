package lsg.consumables.food;

import lsg.characters.Hero;
import lsg.consumables.Consumable;

public class Food extends Consumable {

    public Food(String name, int capacity) {

        super(name, capacity, Hero.LIFE_STAT_STRING);

    }

}
