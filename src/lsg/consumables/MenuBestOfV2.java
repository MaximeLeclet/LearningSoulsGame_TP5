package lsg.consumables;

import lsg.consumables.drinks.*;
import lsg.consumables.food.*;
import java.util.*;

public class MenuBestOfV2 {

    private HashSet<Consumable> menu = new HashSet<>(Arrays.asList(new Hamburger(), new Wine(), new American(), new Coffee(), new Whisky()));


    @Override
    public String toString() {

        String menuString = this.getClass().getSimpleName() + " :";

        int i = 1;

        for(Consumable cons : menu) {

            menuString = menuString.concat("\n" + (i+1) + " : " + cons.toString());
            i++;

        }

        return menuString;

    }

    public static void main(String[] args) {

        MenuBestOfV2 menu = new MenuBestOfV2();
        System.out.println(menu.toString());

    }

}