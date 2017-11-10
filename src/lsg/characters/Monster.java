package lsg.characters;

import lsg.buffs.BuffItem;
import lsg.buffs.talismans.Talisman;

public class Monster extends Character {

    private static int INSTANCES_COUNT = 0;

    private float skinThickness = 20;
    private Talisman talisman;

    public Monster() {
        super();
        INSTANCES_COUNT++;
        this.setName("Monster_" + INSTANCES_COUNT);
        this.setMaxLife(10);
        this.setLife(this.getMaxLife());
        this.setMaxStamina(10);
        this.setStamina(this.getMaxStamina());
    }

    public Monster(String name) {
        this();
        this.setName(name);
    }

    public float getSkinThickness() {
        return skinThickness;
    }

    protected void setSkinThickness(float skinThickness) {
        this.skinThickness = skinThickness;
    }

    public Talisman getTalisman() {
        return talisman;
    }

    public void setTalisman(Talisman talisman) {

        this.talisman = talisman;

    }

    public float getTotalBuff() {

        return (talisman != null) ? talisman.computeBuffValue() : 0;

    }

    @Override
    public float computeProtection() {
        return skinThickness;
    }

    @Override
    public float computeBuff() { return getTotalBuff(); }
}
