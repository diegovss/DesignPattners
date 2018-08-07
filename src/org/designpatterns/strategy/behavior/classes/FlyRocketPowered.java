package org.designpatterns.strategy.behavior.classes;

import org.designpatterns.strategy.behavior.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
	public void fly(){
		System.out.println("I am flying like a rocket!");
	}
}
