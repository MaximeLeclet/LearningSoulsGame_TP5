package lsg;

import lsg.armor.BlackWitchVeil;
import lsg.armor.DragonSlayerLeggings;
import lsg.armor.RingedKnightArmor;
import lsg.buffs.rings.RingOfDeath;
import lsg.buffs.rings.RingOfSwords;
import lsg.characters.*;
import lsg.consumables.Consumable;
import lsg.consumables.MenuBestOfV4;
import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.drinks.Wine;
import lsg.consumables.food.American;
import lsg.consumables.food.Hamburger;
import lsg.consumables.repair.RepairKit;
import lsg.weapons.Claw;
import lsg.weapons.ShotGun;
import lsg.weapons.Sword;
import lsg.weapons.Weapon;

import java.lang.Character;
import java.util.Arrays;
import java.util.Scanner;

public class LearningSoulsGame {

    public static final String BULLET_POINT = "\u2219";

    private Scanner scanner = new Scanner(System.in);

    private lsg.characters.Hero hero = new Hero();
    private lsg.characters.Monster monster = new Monster();

    public static void main(String[] args) {

        LearningSoulsGame learningSoulsGame = new LearningSoulsGame();

        learningSoulsGame.play_v1();

    }

    public void play_v1() {

        init();
        fight1v1();

    }

    public void init() {

        hero.setWeapon(new Sword());
        hero.setArmorItem(new BlackWitchVeil(), 1);
        hero.setArmorItem(new DragonSlayerLeggings(), 2);
        hero.setArmorItem(new RingedKnightArmor(), 3);
        hero.setConsumable(new Hamburger());

        RingOfDeath ringOfDeath = new RingOfDeath();
        RingOfSwords ringOfSwords = new RingOfSwords();
        hero.setRing(ringOfDeath, 1);
        hero.setRing(ringOfSwords, 2);
        ringOfDeath.setHero(hero);
        ringOfSwords.setHero(hero);

        monster = new Lycanthrope();

    }

    public void fight1v1() {

        int attack;
        int damages;
        int action;

        lsg.characters.Character attacker = hero;
        lsg.characters.Character attacked = monster;
        lsg.characters.Character transfer;

        title();

        while(hero.isAlive() && monster.isAlive()) {

            refresh();

            if(attacker instanceof Hero) {

                do {

                    System.out.print("Hero action for next move : (1) attack | (2) consume > ");
                    action = scanner.nextInt();

                } while (action < 1 || action > 2);

                if(action == 1) {

                    attack = attacker.attack();
                    damages = attacked.getHitWith(attack);

                    System.out.println("\n" + attacker.getName() + " attacks " + attacked.getName() + " with " + attacker.getWeapon().getName() + " (ATTACK:" + attack + " | DMG : " + damages + ")");

                    transfer = attacked;
                    attacked = attacker;
                    attacker = transfer;

                }
                else {

                    hero.consume();

                }

            }
            else {

                attack = attacker.attack();
                damages = attacked.getHitWith(attack);

                System.out.println("\n" + attacker.getName() + " attacks " + attacked.getName() + " with " + attacker.getWeapon().getName() + " (ATTACK:" + attack + " | DMG : " + damages + ")");

                transfer = attacked;
                attacked = attacker;
                attacker = transfer;

            }

        }

        refresh();

        System.out.println("\n--- " + attacked.getName() + " WINS !!! ---");

    }

    public void title() {

        System.out.println("###############################");
        System.out.println("#   THE LEARNING SOULS GAME   #");
        System.out.println("###############################");
        System.out.println();

    }

    public void refresh() {

        hero.printStats();
        System.out.println(BULLET_POINT + " " + hero.getWeapon().toString());
        System.out.println(BULLET_POINT + " "  + hero.getConsumable().toString());

        System.out.println();

        monster.printStats();

        System.out.println();

    }

    public void play_v2() {

        init();
        fight1v1();

    }

    public void play_v3() {

        init();
        fight1v1();

    }

    public void createExhaustedHero() {

        hero.getHitWith(99);
        hero.setWeapon(new Weapon("Grosse Arme", 0, 0, 100 ,100));
        hero.attack();
        hero.printStats();

    }

    public void aTable() {

        MenuBestOfV4 menuBestOfV4 = new MenuBestOfV4(Arrays.asList(new Hamburger(), new Wine(), new American(), new Coffee(), new Whisky(), new RepairKit()));

        for (Consumable cons : menuBestOfV4) {
            System.out.println();
            hero.use(cons);
            hero.printStats();
            System.out.println("Apres utilisation : " + cons.toString());

        }

        hero.getWeapon().toString();

    }

}
