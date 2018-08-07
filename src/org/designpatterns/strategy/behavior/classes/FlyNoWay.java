package org.designpatterns.strategy.behavior.classes;

import org.designpatterns.strategy.behavior.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly!!!");
	}

}
