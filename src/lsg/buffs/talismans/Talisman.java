package lsg.buffs.talismans;

import java.util.Calendar;

import lsg.buffs.BuffItem;

/**
 * Hérite de la classe BuffItem, et propose un buff actif seulement entre une heure de départ et une heure de fin
 */
public class Talisman extends BuffItem {

	private float buff ;
	private int start, end ;

	/**
	 * Construit un Talisman
	 * @param name Nom du Talisman
	 * @param buff Buff du Talisman lors de ses périodes d'activité
	 * @param start Heure de début de l'effet du Talisman
	 * @param end Heure de fin de l'effet du Talisman
	 */
	public Talisman(String name, float buff, int start, int end) {
		super(name) ;
		this.buff = buff ;
		this.start = start ;
		this.end = end ;
	}

	/**
	 * Si l'heure actuelle se trouve entre le début et la fin de la période d'activité du Talisman, le buff retourné est celui de l'objet, sinon, il est nul
	 * @return Buff de l'objet en fonction de l'heure actuelle
	 */
	@Override
	public float computeBuffValue() {
		int now = Calendar.getInstance().get(Calendar.HOUR_OF_DAY) ;
		if(start <= end){
			if(now >= start && now < end) return buff ;
			else return 0f ;
		}else{
			if( (now <= 23 && now >= start) || (now >=0 && now < end)) return buff ;
			else return 0f ;
		}
	}
	
}
