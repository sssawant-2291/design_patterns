package com.app.entites.impl;

import com.app.entites.flyable;
import com.app.entites.quackable;

public abstract class Duck {
	protected flyable flyBehaviour;
	protected quackable quackBehaviour;
	
	public Duck() {
		
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void setFlyBehaviour(flyable fb) {
		this.flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(quackable qb) {
		this.quackBehaviour = qb;
	}
}
