package lsg.consumables;

import lsg.consumables.drinks.*;
import lsg.consumables.food.*;
import java.util.*;

public class MenuBestOfV3 extends HashSet<Consumable> {

    public MenuBestOfV3(Collection<? extends Consumable> c) {

        super(c);
        
    }

    public static void main(String[] args) {

        MenuBestOfV3 menu = new MenuBestOfV3(Arrays.asList(new Hamburger(), new Wine(), new American(), new Coffee(), new Whisky()));
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
