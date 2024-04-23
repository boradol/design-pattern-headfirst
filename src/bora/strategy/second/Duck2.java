package bora.strategy.second;

public abstract class Duck2 {
    // 헤엄
    void swim() {
        System.out.println("헤엄치다");
    }
    // 형식별로 고유한 모양을 화면에 보여주는 메소드
    abstract void display();
}
