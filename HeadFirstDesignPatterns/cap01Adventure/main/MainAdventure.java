package main;

import character.King;
import weapon.BowAndArrowBehavior;
import character.Character;

public class MainAdventure {

	public static void main(String[] args) {
		
		Character character = new King();
		character.useWapeon();
		character.setWeapon(new BowAndArrowBehavior());
		character.useWapeon();
	}
}
