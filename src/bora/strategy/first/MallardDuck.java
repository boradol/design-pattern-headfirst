package bora.strategy.first;

public class MallardDuck extends Duck {
    @Override
    void display() {
        System.out.println("MallardDuck Shape");
    }

    @Override
    public void fly() {
        System.out.printf("날다");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
