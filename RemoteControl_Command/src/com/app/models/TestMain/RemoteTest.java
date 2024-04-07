package com.app.models.TestMain;

import com.app.models.appliances.GarageDoor;
import com.app.models.appliances.Light;
import com.app.models.commands.GarageDoorUp;
import com.app.models.commands.LightsOn;
import com.app.models.remote.SimpleRemoteControl;

public class RemoteTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		GarageDoor gDoor = new GarageDoor();
		
		GarageDoorUp cmdGDoorUp = new GarageDoorUp(gDoor);
		LightsOn cmdLightOn = new LightsOn(light);
		
		remote.setCommand(cmdGDoorUp);
		remote.buttonPressed();
		
		remote.setCommand(cmdLightOn);
		remote.buttonPressed();
	}

}
