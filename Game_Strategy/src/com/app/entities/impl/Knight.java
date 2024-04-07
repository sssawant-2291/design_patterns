package com.app.entities.impl;

import com.app.entities.Character;

public class Knight extends Character {
	public Knight() {
		weapon = new KnifeBehaviour();
	}
	@Override
	public void fight() {
		System.out.println("Knight is fighting...");
		weapon.useWeapon();
		
	}

}
