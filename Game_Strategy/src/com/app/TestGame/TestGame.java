package com.app.TestGame;
import com.app.entities.Character;
import com.app.entities.impl.King;
import com.app.entities.impl.Knight;
import com.app.entities.impl.Queen;
import com.app.entities.impl.Troll;

public class TestGame {

	public static void main(String[] args) {
		Character character = new King();
		character.fight();
		
		character = new Queen();
		character.fight();
		
		character = new Knight();
		character.fight();
		
		character = new Troll();
		character.fight();
		
		

	}

}
