package com.app.entites.impl;

import com.app.entites.quackable;

public class SilentQuack implements quackable {

	@Override
	public void quack() {
		System.out.println("<<< No quack sound >>>");
	}

}
