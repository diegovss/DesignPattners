package org.designpatterns.strategy.behavior.classes;

import org.designpatterns.strategy.behavior.interfaces.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack");
	}
	
}
