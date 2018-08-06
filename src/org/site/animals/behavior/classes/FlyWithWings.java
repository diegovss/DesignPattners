package org.site.animals.behavior.classes;

import org.site.animals.behavior.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying!");
	}

}
