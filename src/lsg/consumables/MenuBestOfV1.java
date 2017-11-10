package lsg.consumables;

import lsg.consumables.drinks.*;
import lsg.consumables.food.*;

public class MenuBestOfV1 {

    private Consumable[] menu = new Consumable[]{new Hamburger(), new Wine(), new American(), new Coffee(), new Whisky()};

    @Override
    public String toString() {

        String menuString = new String(this.getClass().getSimpleName() + " :");

        for(int i = 0; i < menu.length; i++) {

            menuString = menuString.concat("\n" + (i+1) + " : " + menu[i].toString());

        }

        return menuString;

    }

    public static void main(String[] args) {

        MenuBestOfV1 menu = new MenuBestOfV1();
        System.out.println(menu.toString());

    }

}
