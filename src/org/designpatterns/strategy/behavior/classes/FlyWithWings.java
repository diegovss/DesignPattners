package org.designpatterns.strategy.behavior.classes;

import org.designpatterns.strategy.behavior.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying!");
	}

}
