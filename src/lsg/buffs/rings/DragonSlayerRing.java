package lsg.buffs.rings;

import lsg.armor.ArmorItem;
import lsg.armor.DragonSlayerLeggings;

/**
 * Anneau donnant une "puissance" de 14.0 au Hero qui le porte (si il y en a un) seulement si il possède un item (armure) de type DragonSlayerLeggings, sinon 0 (voir la classe Ring).
 */
public class DragonSlayerRing extends Ring{
	
	public DragonSlayerRing() {
		super("Dragon Slayer Ring", 14) ;
	}
	
	@Override
	public float computeBuffValue() {
		if(hero != null && hasDragonsSlayerItem()){
			return power ;
		}else return 0 ;
	}
	
	private boolean hasDragonsSlayerItem(){
		ArmorItem[] items = hero.getArmorItems() ;
		for(ArmorItem item: items){
			if(item instanceof DragonSlayerLeggings) return true ; 
		}
		return false ;
	}
	
}
