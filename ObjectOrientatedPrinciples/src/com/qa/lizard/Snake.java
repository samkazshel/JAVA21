package com.qa.lizard;

import com.qa.interfaces.Camoflague;

public class Snake implements Camoflague{

	@Override
	public void camouflague() {
		System.out.println("dissappears into sand");
	}

	@Override
	public void hide() {
		System.out.println("hides in sand");
		
	}

}
