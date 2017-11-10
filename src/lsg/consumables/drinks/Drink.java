package lsg.consumables.drinks;

import lsg.characters.Hero;
import lsg.consumables.Consumable;

public class Drink extends Consumable{

    public Drink(String name, int capacity) {

        super(name, capacity, Hero.STAM_STAT_STRING);

    }

}
