package bora.strategy.third;

public class DecoyDuck3 extends Duck3 {
    public DecoyDuck3() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    void display() {
        System.out.println("DecoyDuck Shape");
    }
}
