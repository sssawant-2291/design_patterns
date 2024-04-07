package com.app.models.TestMain;

import com.app.models.Command;
import com.app.models.MacroCommand;
import com.app.models.appliances.GarageDoor;
import com.app.models.appliances.Light;
import com.app.models.appliances.MusicSystem;
import com.app.models.appliances.PartyLight;
import com.app.models.appliances.Sprinkler;
import com.app.models.appliances.Tv;
import com.app.models.commands.GarageDoorDown;
import com.app.models.commands.GarageDoorLightsOff;
import com.app.models.commands.GarageDoorLightsOn;
import com.app.models.commands.GarageDoorUp;
import com.app.models.commands.LightsOff;
import com.app.models.commands.LightsOn;
import com.app.models.commands.MusicSystemOff;
import com.app.models.commands.MusicSystemOn;
import com.app.models.commands.PartyLightOff;
import com.app.models.commands.PartyLightOn;
import com.app.models.commands.SprinklerOff;
import com.app.models.commands.SprinklerOn;
import com.app.models.commands.TvOff;
import com.app.models.commands.TvOn;
import com.app.models.remote.RemoteControl;

public class RemoteTest1 {

	public static void main(String args[]) {
		RemoteControl remote = new RemoteControl(6);
		
		Tv tv = new Tv();
		MusicSystem ms = new MusicSystem();
		PartyLight pLight = new PartyLight();
		Light light = new Light();
		GarageDoor gDoor = new GarageDoor();
		Sprinkler sprinkler = new Sprinkler();
		
		LightsOn lightOn = new LightsOn(light);
		LightsOff lightOff = new LightsOff(light);
		GarageDoorUp gDoorUp = new GarageDoorUp(gDoor);
		GarageDoorDown gDoorDown = new GarageDoorDown(gDoor);
		GarageDoorLightsOn gDLightOn = new GarageDoorLightsOn(gDoor);
		GarageDoorLightsOff gDLightOff = new GarageDoorLightsOff(gDoor);
		SprinklerOn spOn = new SprinklerOn(sprinkler);
		SprinklerOff spOff = new SprinklerOff(sprinkler);
		
		Command[] partyOn = { new TvOn(tv), new MusicSystemOn(ms), new PartyLightOn(pLight) };
		Command[] partyOff = { new TvOff(tv), new MusicSystemOff(ms), new PartyLightOff(pLight) };
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		

		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, gDoorUp, gDoorDown);
		remote.setCommand(2, gDLightOn, gDLightOff);
		remote.setCommand(3, spOn, spOff);
		remote.setCommand(4, partyOnMacro, partyOffMacro);
		
		System.out.println(remote);
		
		remote.onButtonPressed(4);
		remote.offButtonPressed(4);
//		remote.undo();
		
//		remote.onButtonPressed(0);
//		remote.onButtonPressed(10);
//		remote.undo();
//		remote.undo();

//		remote.onButtonPressed(0);
//		remote.onButtonPressed(2);
//		remote.offButtonPressed(0);
//		remote.onButtonPressed(4);
//		remote.onButtonPressed(10);
	}

}
