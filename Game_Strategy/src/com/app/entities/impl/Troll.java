package com.app.entities.impl;

import com.app.entities.Character;

public class Troll extends Character {
	
	public Troll() {
		weapon = new BowAndArrowBehaviour();
	}
	
	@Override
	public void fight() {
		System.out.println("Troll is fighting...");
		weapon.useWeapon();
	}

}
