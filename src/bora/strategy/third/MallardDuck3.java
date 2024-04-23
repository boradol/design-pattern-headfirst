package bora.strategy.third;

public class MallardDuck3 extends Duck3 {
    public MallardDuck3() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("MallardDuck Shape");
    }
}
