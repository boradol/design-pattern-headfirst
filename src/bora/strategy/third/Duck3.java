package bora.strategy.third;

public abstract class Duck3 {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // 헤엄
    void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }

    // 형식별로 고유한 모양을 화면에 보여주는 메소드
    abstract void display();

    void performedQuack() {
        quackBehavior.quack();
    }

    void performedFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
