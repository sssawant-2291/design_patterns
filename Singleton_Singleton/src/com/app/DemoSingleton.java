package com.app;

public class DemoSingleton {
	private static DemoSingleton instance;
	
	private DemoSingleton() {
		System.out.println("Constructor called...");
	}
	
	public static DemoSingleton getInstance() {
		if(instance == null) {
			instance = new DemoSingleton();
		}
		return instance;
	}
	
	
}
