package character;

import weapon.WeaponBehavior;

public abstract  class Character {
	
	WeaponBehavior weaponBehavior;

	public abstract void flight();
	
	public void setWeapon(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	public void useWapeon() {
		this.weaponBehavior.useWeapon();
	}
}
