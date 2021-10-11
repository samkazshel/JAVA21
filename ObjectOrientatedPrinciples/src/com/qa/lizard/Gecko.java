package com.qa.lizard;

import com.qa.interfaces.Camoflague;
import com.qa.interfaces.Climbing;

public class Gecko implements Camoflague, Climbing{

	@Override
	public void camouflague() {
		System.out.println("Changes skin to tree bark");
	}

	@Override
	public void hide() {
		System.out.println("hides on a tree");
	}

	@Override
	public void stickyClaws() {
		System.out.println("Sticks to surface");
		
	}

	@Override
	public void propellerTails() {
		System.out.println("*activates propeller tail*");
		
	}

}
