package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

	private int damage;
	private int hitPoints;
	private boolean hasArmour;

	public MilitaryUnit(int damage, int hitPoints, boolean hasArmour) {
		this.damage = damage;
		this.hitPoints = hitPoints;
		this.hasArmour = hasArmour;
	}

}
