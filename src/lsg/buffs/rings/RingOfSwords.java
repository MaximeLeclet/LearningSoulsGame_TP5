package lsg.buffs.rings;

import lsg.characters.Hero;
import lsg.weapons.Sword;

/**
 * Anneau donnant une "puissance" de 10.0 au Hero qui le porte (si il y en a un) seulement si il est équipé d'une instance de Sword comme arme, sinon 0 (voir la classe Ring).
 */
public class RingOfSwords extends Ring{
	
	public RingOfSwords() {
		super("Ring of Swords", 10) ;
	}
	
	@Override
	public float computeBuffValue() {
		if (hero != null && (hero.getWeapon() instanceof Sword) )  return power ;
		else return 0f ;
		
	}
	
	/**
	 * Un test...
	 * @param args non utilisé
	 */
	public static void main(String[] args) {
		Hero hero = new Hero() ;
		RingOfSwords r = new RingOfSwords() ;
		hero.setRing(r, 1);
		hero.setWeapon(new Sword());
		System.out.println(r);
	}
}
