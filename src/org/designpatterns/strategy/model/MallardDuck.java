package org.designpatterns.strategy.model;

import org.designpatterns.strategy.behavior.classes.FlyWithWings;
import org.designpatterns.strategy.behavior.classes.Quack;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I am a real Mallard duck");
	}

}
