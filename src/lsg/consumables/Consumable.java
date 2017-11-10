package lsg.consumables;

import lsg.bags.Collectible;

public class Consumable implements Collectible {

    private String name;
    private int capacity;
    private String stat;

    public Consumable(String name, int capacity, String stat) {

        this.name = name;
        this.capacity = capacity;
        this.stat = stat;

    }

    public int use() {

        int cap = capacity;
        capacity = 0;
        return cap;

    }

    public String getName() {
        return name;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getStat() {
        return stat;
    }

    @Override
    public String toString() {

        return(name + " [" + capacity + " " + stat + " point(s)]");

    }

    @Override
    public int getWeight() {
        return 1;
    }
}
