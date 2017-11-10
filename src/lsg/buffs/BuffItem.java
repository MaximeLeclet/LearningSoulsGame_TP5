package lsg.buffs;

import lsg.bags.Collectible;

import java.util.Locale;

/**
 * Classe abstraite définnissant un objet conferant du "buff", elle n'est pas instanciable
 */
public abstract class BuffItem implements Collectible {

	/**
	 * Nom de l'objet (item)
	 */
	private String name;

	/**
	 * Construit un BuffItem avec un nom passé en paramètre
	 * @param name Nom donné à l'objet
	 */
	public BuffItem(String name) {
		this.name = name ;
	}

	/**
	 * Méthode retournant la valeur de buff conférée par cet item, abstraite car on ne connait pas encore la nature de l'objet
	 * @return Valeur du buff
	 */
	public abstract float computeBuffValue() ;

	/**
	 * Retourne le nom de l'item
	 * @return Nom de l'item
	 */
	public String getName() {
		return name;
	}

	/**
	 * Permet d'afficher une description de l'objet contenant le nom ainsi que la valeur du buff
	 * @return Description de l'item
	 */
	@Override
	public String toString() {
		return String.format(Locale.US, "[%s, %.2f]", getName(), computeBuffValue()) ;
	}

	@Override
	public int getWeight() {
		return 1;
	}
}
