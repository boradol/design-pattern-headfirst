package bora.strategy.first;

public class RedheadDuck extends Duck{
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
