package bora.strategy.first;

public abstract class Duck {
    // 꽥꽥 -> Quackable 인터페이스로
    void quack() {
        System.out.println("꽥꽥");
    }
    // 날다 -> Flyable 인터페이스로
    void fly() {
        System.out.println("날다");
    }

    // 헤엄
    void swim() {
        System.out.println("헤엄치다");
    }
    // 형식별로 고유한 모양을 화면에 보여주는 메소드
    abstract void display();
}
