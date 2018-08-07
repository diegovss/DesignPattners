package org.designpatterns.strategy.model;

import org.designpatterns.strategy.behavior.classes.FlyNoWay;
import org.designpatterns.strategy.behavior.classes.Quack;


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
