package org.site.animals.simulator;

import org.site.animals.Duck;
import org.site.animals.MallardDuck;
import org.site.animals.ModelDuck;
import org.site.animals.behavior.classes.FlyRocketPowered;


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
