package bora.strategy.second;

public class MallardDuck2 extends Duck2 implements Quackable, Flyable {
    @Override
    void display() {
        System.out.println("MallardDuck Shape");
    }

    @Override
    public void fly() {
        System.out.printf("높이 날다");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
