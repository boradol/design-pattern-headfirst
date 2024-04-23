package bora.strategy.third;

public class ModelDuck3 extends Duck3 {
    public ModelDuck3() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
