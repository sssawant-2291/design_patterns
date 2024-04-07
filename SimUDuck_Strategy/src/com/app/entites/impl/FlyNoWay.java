package com.app.entites.impl;

import com.app.entites.flyable;

public class FlyNoWay implements flyable {

	@Override
	public void fly() {
		System.out.println("<<< can't fly >>>");
		
	}

}
