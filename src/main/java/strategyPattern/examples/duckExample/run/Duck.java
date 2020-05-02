package strategyPattern.examples.duckExample.run;

import strategyPattern.examples.duckExample.duckCapabilities.FlyBehavior;
import strategyPattern.examples.duckExample.duckCapabilities.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All Ducks can Swim!");
    }

    public abstract void display();
}