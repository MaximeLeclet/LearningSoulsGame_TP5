package lsg.buffs.rings;

import lsg.buffs.BuffItem;
import lsg.characters.Hero;

/**
 * Représente un anneau, hérite de la classe Talisman, offre du "pouvoir" à une instance de Hero définie
 */
public abstract class Ring extends BuffItem {

	protected int power ; 
	protected Hero hero ;

	/**
	 * Construit un Ring avec un nom et la valeur de la puissance de l'anneau
	 * @param name Nom de l'anneau
	 * @param power Puissance de l'anneau
	 */
	public Ring(String name, int power) {
		super(name) ;
		this.power = power ;
	}

	/**
	 * Lie une instance de Hero à cet objet
	 * @param hero Hero "portant" l'anneau
	 */
	public void setHero(Hero hero) {
		this.hero = hero;
	}

	/**
	 * Retourne le Hero porteur de cet anneau
	 * @return Hero "portant" cet anneau
	 */
	public Hero getHero() {
		return hero;
	}
	
}
