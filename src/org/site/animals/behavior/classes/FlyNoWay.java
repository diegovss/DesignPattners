package org.site.animals.behavior.classes;

import org.site.animals.behavior.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly!!!");
	}

}
