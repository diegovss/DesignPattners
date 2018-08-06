package org.site.animals;

import org.site.animals.behavior.classes.FlyNoWay;
import org.site.animals.behavior.classes.Quack;


public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a model Duck!");
	}
	
}
