package com.app.entities;

public abstract class Character {
	protected WeaponBehaviour weapon;
	
	public Character() {
	}
	
	public abstract void fight();
	
	public void setWeapon(WeaponBehaviour wb) {
		this.weapon = wb;
	}
}
