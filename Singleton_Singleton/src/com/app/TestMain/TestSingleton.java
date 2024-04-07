package com.app.TestMain;

import com.app.DemoSingleton;

public class TestSingleton {

	public static void main(String[] args) {
		DemoSingleton obj1 = DemoSingleton.getInstance();
		DemoSingleton obj2 = DemoSingleton.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
