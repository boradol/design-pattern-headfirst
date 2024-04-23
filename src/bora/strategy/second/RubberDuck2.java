package bora.strategy.second;

public class RubberDuck2 extends Duck2 implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }

    @Override
    void display() {
        System.out.println("RubberDuck Shape");
    }
}
