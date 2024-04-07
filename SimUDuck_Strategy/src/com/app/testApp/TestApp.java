package com.app.testApp;

import com.app.entites.actual.PlasticDuck;
import com.app.entites.actual.RedHeadDuck;
import com.app.entites.impl.Duck;
import com.app.entites.impl.FlyWithRocketPower;

public class TestApp {

	public static void main(String[] args) {
		Duck duck = new RedHeadDuck();
		duck.performFly();
		duck.performQuack();
		
		Duck plasticDuck = new PlasticDuck();
		plasticDuck.display();
		plasticDuck.performFly();							   // prev duck can't fly
		plasticDuck.setFlyBehaviour(new FlyWithRocketPower()); // used setter for adding flying behaviour dynammically
		plasticDuck.performFly();
		plasticDuck.performQuack();
	}

}
