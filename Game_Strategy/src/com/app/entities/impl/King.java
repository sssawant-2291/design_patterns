package com.app.entities.impl;

import com.app.entities.Character;

public class King extends Character {
	
	public King() {
		weapon = new SwordBehaviour();
	}
	
	public void fight() {
		System.out.println("King is fighting...");
		weapon.useWeapon();
	}

}
