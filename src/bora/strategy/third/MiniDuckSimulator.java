package bora.strategy.third;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("=======================");
        Duck3 mallard = new MallardDuck3();
        mallard.performedQuack();
        mallard.performedFly();

        System.out.println("=======================");
        Duck3 model = new ModelDuck3();
        model.performedFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performedFly();
    }
}
