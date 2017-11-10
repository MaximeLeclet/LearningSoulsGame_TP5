package lsg.characters;

import lsg.weapons.Claw;

public class Lycanthrope extends Monster {

    public Lycanthrope() {

        super("Lycanthrope");
        this.setWeapon(new Claw());
        this.setSkinThickness(30.0f);

    }

}
