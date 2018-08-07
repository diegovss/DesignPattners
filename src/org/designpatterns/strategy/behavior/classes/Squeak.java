package org.designpatterns.strategy.behavior.classes;

import org.designpatterns.strategy.behavior.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior{
	public void quack(){
		System.out.println("Squeak!");
	}
}
