package lsg.consumables;

import lsg.consumables.drinks.*;
import lsg.consumables.food.*;
import lsg.consumables.repair.RepairKit;

import java.util.*;

public class MenuBestOfV4 extends LinkedHashSet<Consumable> {

    public MenuBestOfV4(Collection<? extends Consumable> c) {

        super(c);

    }

    public static void main(String[] args) {

        MenuBestOfV4 menu = new MenuBestOfV4(Arrays.asList(new Hamburger(), new Wine(), new American(), new Coffee(), new Whisky(), new RepairKit()));
        System.out.println(menu.toString());

    }

    @Override
    public String toString() {

        String menuString = this.getClass().getSimpleName() + " :";

        int i = 1;


        for (Consumable cons : this) {

            menuString = menuString.concat("\n" + (i) + " : " + cons.toString());
            i++;

        }

        return menuString;

    }

}