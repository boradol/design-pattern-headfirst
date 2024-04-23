package bora.strategy.third;

public class RedheadDuck3 extends Duck3{
    public RedheadDuck3() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("RedheadDuck Shape");
    }
}
