package bora.singleton.classic;

public class StaticSingleton {
    private static final StaticSingleton uniqueInstance = new StaticSingleton();

    // 기타 인스턴스 변수

    private StaticSingleton() {}

    public static StaticSingleton getInstance() {
        return uniqueInstance;
    }
}
