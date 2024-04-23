package bora.strategy.second;

public class RedheadDuck2 extends Duck2 implements Quackable, Flyable {
    @Override
    void display() {
        System.out.println("RedheadDuck Shape");
    }

    @Override
    public void fly() {
        System.out.println("날다");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
