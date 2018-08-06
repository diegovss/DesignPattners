package org.site.animals.behavior.classes;

import org.site.animals.behavior.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior{
	public void quack(){
		System.out.println("Squeak!");
	}
}
