package bora.strategy.third;

public class RubberDuck3 extends Duck3 {
    public RubberDuck3() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("RubberDuck Shape");
    }
}
