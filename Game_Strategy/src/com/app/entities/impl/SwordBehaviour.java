package com.app.entities.impl;

import com.app.entities.WeaponBehaviour;

public class SwordBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("Using sword as a weapon..");
	}

}
