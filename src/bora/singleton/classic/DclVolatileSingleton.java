package bora.singleton.classic;

public class DclVolatileSingleton {
    private static volatile DclVolatileSingleton uniqueInstance;

    // 기타 인스턴스 변수

    private DclVolatileSingleton() {}

    public static DclVolatileSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DclVolatileSingleton.class) {
                uniqueInstance = new DclVolatileSingleton();
            }
        }
        return uniqueInstance;
    }
}
