package bora.strategy.first;

public class DecoyDuck extends Duck {
    @Override
    void quack() {
        // 아무것도 하지 않도록 오버라이드
    }

    @Override
    void fly() {
        // 아무것도 하지 않도록 오버라이드
    }

    @Override
    void display() {
        System.out.println("DecoyDuck Shape");
    }
}
