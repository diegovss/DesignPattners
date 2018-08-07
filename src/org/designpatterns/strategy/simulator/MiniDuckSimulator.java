package org.designpatterns.strategy.simulator;

import org.designpatterns.strategy.behavior.classes.FlyRocketPowered;
import org.designpatterns.strategy.model.Duck;
import org.designpatterns.strategy.model.MallardDuck;
import org.designpatterns.strategy.model.ModelDuck;


public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();	
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
