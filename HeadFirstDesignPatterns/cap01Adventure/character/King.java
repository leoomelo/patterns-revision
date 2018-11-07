package character;

import weapon.KnifeBehavior;

public class King extends Character {

	public King() {
		weaponBehavior = new KnifeBehavior();
	}
	
	@Override
	public void flight() {
		System.out.println("King is fighting");

	}

}
