package org.site.animals.behavior.classes;

import org.site.animals.behavior.interfaces.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack");
	}
	
}
