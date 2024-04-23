package bora.strategy.first;

public class RubberDuck extends Duck {
    // fly까지 상속되어짐.
    @Override
    public void quack() {
        System.out.println("삑삑");
    }

    @Override
    void fly() {
        // 아무것도 하지 않도록 오버라이드
    }

    @Override
    void display() {
        System.out.println("RubberDuck Shape");
    }
}
