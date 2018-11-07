package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	
	QuackBehavior quackBehavior;

	public abstract void display();
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public void performQuack() {
		quackBehavior.quack();		
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuakBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
