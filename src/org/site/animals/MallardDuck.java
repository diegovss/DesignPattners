package org.site.animals;

import org.site.animals.behavior.classes.FlyWithWings;
import org.site.animals.behavior.classes.Quack;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I am a real Mallard duck");
	}

}
