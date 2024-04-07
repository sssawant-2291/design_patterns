package com.app.entities.impl;

import com.app.entities.Character;

public class Queen extends Character {
	
	public Queen() {
		weapon = new AxeBehaviour();
	}
	@Override
	public void fight() {
		System.out.println("Queen is fighting...");
		weapon.useWeapon();

	}

}
